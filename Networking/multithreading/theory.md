1. LIFE CYCLE OF A THREAD:

1. New

When the thread is created and with all set up to run.

2. Active 

The ThreadScheduler is in charge of distributing time for each thread in the multithreaded environment.

  2.I RUNNABLE 
      - This is the time when the thread is waiting for the current running thread to complete. 

  2.II RUNNING 
      - This is the state where the thread is currently running.

3. Waiting / Blocked
   - This is whenever the thread is not active. It has been blocked for temporary amount of time.

4. Time waiting
   - This is the time when the thread is assigned to wait for the specific amount of time. 
   eg: When the thread envokes sleep method. It states the amount of time it will be in waiting state.

5. Terminated
   - The thread can terminates mostly for the two reasons , eigher it completed it's job , or 
   The exception occurred during it's execution.

read more: https://www.javatpoint.com/life-cycle-of-a-thread