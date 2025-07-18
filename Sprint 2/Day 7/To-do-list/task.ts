// Enum
export enum TaskStatus {
    NotDone,
    Done
  }
  
  // Interface
  export interface ITask {
    id: number;
    text: string;
    status: TaskStatus;
  }
  
  // Class using Generics and type casting
  export class Task implements ITask {
    static counter = 1;
    id: number;
    text: string;
    status: TaskStatus;
  
    constructor(text: string) {
      this.id = Task.counter++;
      this.text = text;
      this.status = TaskStatus.NotDone;
    }
  
    toggle(): void {
      this.status = this.status === TaskStatus.Done ? TaskStatus.NotDone : TaskStatus.Done;
    }
  
    isDone(): boolean {
      return this.status === TaskStatus.Done;
    }
  }
  