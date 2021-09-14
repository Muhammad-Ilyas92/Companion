// Hm aik class m bht s object bana  skte hien
//agr aik object banayengay to SKELETON kehte hein
// STATIC METHOD wo hote hein jb hm class k sth method ko call krte hein
//kptlin m hm companion ka use FACTORY PATTERN k lye krte hien
fun main ()
{
  /*  MyClass.MyObject.f() */  // m y chahta hun k mjhy MYOBJECT ko reference na banana pare class or function k darmiyan
                            // us k lye mjhy MYOBJECT k sth COMPANION lkhna parega
    MyClass.f()   // y static method nh hai
    MyClass.AnotherObject.g()
}

class MyClass  //ism jtne object hein wo sb is class s associate krte hien. in ka jo instance h object ka wo class s jurra huwa h. is m utility function ya preperties bana skte ho
{


    companion object MyObject{   // y object mere class s associate h, COMPANION lkhne s y hoga k hm OBJECT ko reference nh krna hoga main function m
                                //aik class m hm aik he COMPANION use kr skte hein
        @JvmStatic
        fun f()        // y java m as a static kam krega
        {
            println("Hello I am Function")
        }
    }

    object AnotherObject{   // y object mere class s associate h
        fun g()
        {
            println("Hello I am Another Function")
        }
    }


}