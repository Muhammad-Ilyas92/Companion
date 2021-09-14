/*
fun main ()
        {

        MyClass.f()
        MyClass.AnotherObject.g()
        }

class MyClass
{
    companion object MyObject{

    fun f()
    {
        println("Hello I am Function")
    }
}
*/


//upr wale program ko prof krne k lye hm java class use krengay

public class CompanionJavaClass {
    public static void main(String args[])
    {
   /* MyClass.MyObject  */ // myclass k bad jb dot dala to y object ko call kr rha h. hamein yahan function ko lana to is k lye hm kotlin file m @JVMStatic lkhengay
    MyClass.f();

    }
}
