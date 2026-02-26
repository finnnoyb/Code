def to_do_list():
    #list contains all task
    tasks = []

    while True:
        #Tasks menu options
        print("-+-+-+-+- To-Do List Manager -+-+-+-+-\n")
        print("1. Add a new task")
        print("2. View all tasks")
        print("3. Delete a task")
        print("4. Exit the program\n")

        #ask user to enter a 'task number' to initiate the program
        ask_user = input("Enter the 'task number' to select task: ")

        #add a new task
        if ask_user == "1":
            enter_task = input("Enter the task: ")
            add_task = tasks.append(enter_task)
            print(f"Task: '{enter_task}' is added successfully.")
            print()

        #View all tasks
        if ask_user == "2":
            #task list is empty
            if not tasks:
                print("Task list is empty.")
                print()
            else:
                #list all tasks with its assigned number
                print("Here are the tasks:")
                for number, add_task in enumerate(tasks, 1):
                    print(f"{number}.{add_task}")
                print()

        #Delete a task
        if ask_user == "3":
            if not tasks:
                print("Task list is empty.")
                print()
            else:
                #delete task if available via index number
                print("Here are the tasks available to delete.")
                for number, add_task in enumerate(tasks, 1):
                    print(f"{number}.{add_task}")
                task_number = int(input("Enter the task number to delete: "))
                deleted_tasks = tasks.pop(task_number-1)
                print()
                print(f"Task: '{deleted_tasks}' is deleted successfully.")
                print()

        #Exit the program
        if ask_user == "4":
            print("You're exit now.")
            break
#call the function to start the program            
to_do_list()
