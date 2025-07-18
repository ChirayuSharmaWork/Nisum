import { Task, TaskStatus } from './task.js';
const tasks = new Map();
// Typecasting input field
const taskInput = document.getElementById("taskInput");
const addButton = document.getElementById("addTaskBtn");
const todoList = document.getElementById("todoList");
function notify(type) {
    if (type === "error")
        alert("Please enter a task!");
}
// Custom type predicate
function isTask(obj) {
    return obj instanceof Task;
}
// Never example
function fail(msg) {
    throw new Error(msg);
}
// Generic Function
function createListItem(task) {
    const li = document.createElement("li");
    li.innerHTML = `${task.id}. ${task.text} - ${task.status === TaskStatus.Done ? "✅" : "❌"}`;
    return li;
}
function addTask() {
    const text = taskInput.value.trim();
    if (!text)
        return notify("error");
    const task = new Task(text);
    tasks.set(task.id, task);
    taskInput.value = "";
    renderTasks();
}
function renderTasks() {
    todoList.innerHTML = "";
    for (const [, task] of tasks) {
        if (!isTask(task))
            continue;
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
const config = { theme: "light", maxTasks: null };
const sampleUnion = { kind: "simple", task: new Task("Try TypeScript") };
// Event Binding
addButton.addEventListener("click", addTask);
