1. What is network programming:
Writing programs that execute accross multiple devices in which the devices are 
all connected to each other.

2. What is socket programming:
It is communication mechanism between two computers using TCP.

3. Steps for establing connection between two computers:

i.  The server instantiates a ServerSocket object , denoting the port number that communication will be occuring on .

ii. The invokes the method accept(). To wait for the client to connect on the established interface.

iii. The client instantiates a Socket object with the server name and the port to which the server is running on.

iv. The constructor of Socket object on the client , attempts to connect to the server using the specfied details.

v. On , the server side , the acccept() method returns the reference to the new socket that is connected to the client's socket.

Read more: https://www.tutorialspoint.com/java/java_networking.htm