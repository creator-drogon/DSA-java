volatile int a =3;
volatile keyword will help in sharing of variable between two threads, one thread changes value, and it is pushed to shared cache instead of local cache
from shared cache value is refreshed and made available to second thread.
AtomicInteger is used in applications such as atomically incremented counters

threadlocal means objects are thread specific so Eg: 10 threads will have 10 objecst to submit 1000 tasks

concurrency is used when multiple tasks need to coordinate, book movie ticket by 2 different thread with common variable of available seats
concurrent data structure - concurrent hashmaps, blocking queue
locks and synchronized can also be used achieve concurrency, use it when resource is shared
#Executor service
Instead of creating 100 threads for 1000 task we create a pool of 10 threads to be used by these 1000 tasks.
We submit all our new task to a service which is pool of threads, internally this service implements blocking queue
fetch new task form qeue and submit it
In java one thread is equivalent to one OS thread
for IO intensive task use pool of more threads, for cpu intensive operation use pool bu current cpu core size

Fixed threadpool - fixed no of threads in a pool using blocking queue
cached threadpool - syncronous queue with only one task and will create new thread if availabale threads are busy, it also kills thread that are idle for more than 60 secs
Scheduled excutor service is used when we have to schedule the thread allocation , add delay, schedule athread to run after every t time.



