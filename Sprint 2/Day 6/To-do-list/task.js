// Symbol to represent task status
export const STATUS = Symbol("status");

// Task class using ES6 class syntax
export class Task {
  static counter = 1;

  constructor(text) {
    this.id = Task.counter++;
    this.text = text;
    this[STATUS] = false;
  }

  toggle() {
    this[STATUS] = !this[STATUS];
  }

  getStatus() {
    return this[STATUS];
  }
}
