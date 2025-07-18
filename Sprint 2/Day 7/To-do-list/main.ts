import { Task, TaskStatus, ITask } from './task.js';

// Type Aliases and Advanced Types
type TaskMap = Map<number, Task>;
type TaskInput = string | null;
type Nullable<T> = T | null;

// Mapped Type (readonly)
type ReadonlyTask = {
  readonly [K in keyof Task]: Task[K];
};

const tasks: TaskMap = new Map();

// Typecasting input field
const taskInput = document.getElementById("taskInput") as HTMLInputElement;
const addButton = document.getElementById("addTaskBtn") as HTMLButtonElement;
const todoList = document.getElementById("todoList") as HTMLUListElement;

// Union + Literal Types + Type Guard
type Feedback = "success" | "error";
function notify(type: Feedback): void {
  if (type === "error") alert("Please enter a task!");
}

// Custom type predicate
function isTask(obj: any): obj is Task {
  return obj instanceof Task;
}

// Never example
function fail(msg: string): never {
  throw new Error(msg);
}

// Generic Function
function createListItem<T extends ITask>(task: T): HTMLLIElement {
  const li = document.createElement("li");
  li.innerHTML = `${task.id}. ${task.text} - ${task.status === TaskStatus.Done ? "✅" : "❌"}`;
  return li;
}

function addTask(): void {
  const text: string = taskInput.value.trim();
  if (!text) return notify("error");

  const task = new Task(text);
  tasks.set(task.id, task);
  taskInput.value = "";
  renderTasks();
}

function renderTasks(): void {
  todoList.innerHTML = "";

  for (const [, task] of tasks) {
    if (!isTask(task)) continue;

    const li = createListItem(task);
    const btn = document.createElement("button");
    btn.textContent = "Toggle";
    btn.onclick = () => {
      task.toggle();
      renderTasks();
    };

    li.appendChild(btn);
    todoList.appendChild(li);
  }
}

// Optional properties and nullable type
interface OptionalConfig {
  theme?: string;
  maxTasks?: number | null;
}
const config: OptionalConfig = { theme: "light", maxTasks: null };

// Discriminated Union
type TaskType = 
  | { kind: "simple"; task: Task }
  | { kind: "important"; task: Task; priority: number };

const sampleUnion: TaskType = { kind: "simple", task: new Task("Try TypeScript") };

// Event Binding
addButton.addEventListener("click", addTask);
