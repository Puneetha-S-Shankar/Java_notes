/*
Converting from one type to anther type is called typecasting. There are two types of typecasting in java
Primitive 
    1. Wideing
        From small to up- byte to short to int to long to float to double. We can do both implicit and explicit.
        **implicit - double X = 20; //20 is int but it will be converted to double automatically
        **explicit - double X = (double) 20; //20 is int but it will be converted to double explicitly
        by the programmer
    2. Narrowing
        From up to small- double to float to long to int to short to byte
        **Explicit: 
        int X = (int) 20.5; //20.5 is double but it will be converted to int explicitly by the programmer
        **Implicit: Not possible because it may cause loss of information
Non primitive
1. Upcasting - converting a subclass type to a superclass type. It is done automatically 
    by the compiler and is also called implicit typecasting. It is safe because a subclass object can be 
    treated as a superclass object without any loss of information.
2. Downcasting - converting a superclass type to a subclass type. It is done manually by the programmer and 
    is also called explicit typecasting. It is not safe because a superclass object may not be able to be treated 
    as a subclass object without losing information or causing a runtime error.

*/
