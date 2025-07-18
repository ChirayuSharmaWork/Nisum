// ✅ Array to store tasks
let tasks = [];

// ✅ Function using object and control flow
function addTask() {
  const input = document.getElementById("taskInput");
  const taskText = input.value.trim();

  if (taskText === "") {
    alert("Please enter a task!");
    return;
  }

  // ✅ Object representing a task
  const task = {
    id: tasks.length + 1,
    text: taskText,
    done: false
  };

  tasks.push(task);
  input.value = "";
  displayTasks();
}

// ✅ Function to display tasks
function displayTasks() {
  const list = document.getElementById("todoList");
  list.innerHTML = "";

  for (let i = 0; i < tasks.length; i++) {
    const task = tasks[i];
    const li = document.createElement("li");

    li.textContent = `${task.id}. ${task.text} - ${task.done ? "Done" : "Not Done"}`;

    const toggleButton = document.createElement("button");
    toggleButton.textContent = "Toggle";
    toggleButton.onclick = function () {
      task.done = !task.done;
      displayTasks();
    };

    li.appendChild(toggleButton);
    list.appendChild(li);
  }
}

// ✅ Hoisting example
showWelcome();

function showWelcome() {
  console.log("Welcome to the To-Do App!");
}
