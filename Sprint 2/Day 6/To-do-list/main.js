import { Task, STATUS } from './task.js';

// ✅ Map to store tasks
const tasks = new Map();

// ✅ Add task using arrow function & enhanced object literal
const addTask = () => {
  const input = document.getElementById("taskInput");
  const taskText = input.value.trim();

  if (!taskText) return alert("Please enter a task!");

  const task = new Task(taskText);
  tasks.set(task.id, task);
  input.value = "";

  renderTasks();
};

// ✅ Render tasks using for...of and destructuring
const renderTasks = () => {
  const list = document.getElementById("todoList");
  list.innerHTML = "";

  for (const [, task] of tasks) {
    const { id, text } = task;

    const li = document.createElement("li");
    li.innerHTML = `${id}. ${text} - ${task.getStatus() ? "✅ Done" : "❌ Not Done"}`;

    const toggleBtn = document.createElement("button");
    toggleBtn.textContent = "Toggle";
    toggleBtn.onclick = () => {
      task.toggle();
      renderTasks();
    };

    li.append(toggleBtn);
    list.appendChild(li);
  }
};

// ✅ Promise with timeout to simulate async start
const startup = () => new Promise(resolve => setTimeout(resolve, 100));
startup().then(() => {
  console.log(`Welcome! Tasks Loaded: ${tasks.size}`);
  document.getElementById("addTaskBtn").addEventListener("click", addTask);
});

// ✅ Extra ES6 features demo
const defaultExample = (msg = "Default Message") => console.log(msg);
defaultExample();

const arr1 = [1, 2];
const arr2 = [3, 4];
console.log("Spread:", [...arr1, ...arr2]);

const restExample = (...args) => console.log("Rest:", args);
restExample(10, 20, 30);

const [a, b] = arr1;
console.log("Destructuring:", a, b);

const taskArray = Array.from(tasks.values());
console.log("Array.from:", taskArray);

console.log("Object.assign:", Object.assign({}, { a: 1 }, { b: 2 }));
console.log("Object.is:", Object.is(NaN, NaN));

const weakMap = new WeakMap();
const weakSet = new WeakSet();
const set = new Set([1, 2, 2, 3]);
console.log("Set:", Array.from(set));
