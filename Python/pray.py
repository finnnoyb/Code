import json
import os

FILENAME = "pray.json"

def load_tasks():
    if os.path.exists(FILENAME):
        with open(FILENAME, "r") as f:
            return json.load(f)
    return []

def save_tasks(tasks):
    with open(FILENAME, "w") as f:
        json.dump(tasks, f)

def show_tasks(tasks):
    if not tasks:
        print("No tasks yet!")
        return
    print("\nYour tasks:")
    for i, task in enumerate(tasks, start=1):   # enumerate gives index + value
        print(f"  {i}. {task}")

def add_task(tasks):
    task = input("Enter task: ").strip()
    if task:                          # Don't add empty tasks
        tasks.append(task)
        save_tasks(tasks)             # Save immediately after every change
        print(f'Added: "{task}"')
    else:
        print("Task can't be empty.")

def remove_task(tasks):
    show_tasks(tasks)
    if not tasks:
        return
    try:
        num = int(input("Enter task number to remove: "))
        removed = tasks.pop(num - 1)  # subtract 1 because lists are 0-indexed
        save_tasks(tasks)
        print(f'Removed: "{removed}"')
    except (ValueError, IndexError):  # Handle bad input gracefully
        print("Invalid number.")

def main():                           # ← no longer nested inside remove_task
    tasks = load_tasks()              # Load saved tasks on startup

    while True:                       # Keep running until user quits
        print("\n--- TO-DO LIST ---")
        print("1. Show tasks")
        print("2. Add task")
        print("3. Remove task")
        print("4. Quit")    
        print("")

        choice = input("Choose (1-4): ").strip()

        if choice == "1":
            show_tasks(tasks)
        elif choice == "2":
            add_task(tasks)
        elif choice == "3":
            remove_task(tasks)
        elif choice == "4":
            print("Bye!")
            break                     # Exit the loop
        else:
            print("Please enter 1, 2, 3, or 4.")



main()





