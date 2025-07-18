// Enum
export var TaskStatus;
(function (TaskStatus) {
    TaskStatus[TaskStatus["NotDone"] = 0] = "NotDone";
    TaskStatus[TaskStatus["Done"] = 1] = "Done";
})(TaskStatus || (TaskStatus = {}));
// Class using Generics and type casting
export class Task {
    constructor(text) {
        this.id = Task.counter++;
        this.text = text;
        this.status = TaskStatus.NotDone;
    }
    toggle() {
        this.status = this.status === TaskStatus.Done ? TaskStatus.NotDone : TaskStatus.Done;
    }
    isDone() {
        return this.status === TaskStatus.Done;
    }
}
Task.counter = 1;
