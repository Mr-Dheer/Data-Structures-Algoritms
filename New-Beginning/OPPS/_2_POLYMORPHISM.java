package OPPS;

//NEECHE PROGRAM HAI PEHLE USSEE DEKHO PHIR BAAKI SABH
//READ KERNA
public class _2_POLYMORPHISM {


    //NEECHE PROGRAM HAI PEHLE USSEE DEKHO PHIR BAAKI SABH
    // READ KERNA


    //    abh yahi ismee mene batman kee argument mein
//    int a paas ker diya..
//  abh ager mein
//    n.batman() karomga karonga toh voh second valla batman
//    chalayega ..
//
//    and yahi abh mein
//    n.batman(10) pass karonga toh voh abh
//    first valla batman chalega ..kyuki uskee
//    argument mein int paas kara hai humne..


//    also yahi polymorphism hai jo arugement paas hothi
//    uskee kee according voh chalatha haiii..
//    abh yahi abh mene koi argumrnt paas karii STRING ke
//    and phir mene likha n.batman("k")toh voh abh
//    uusse chalega jiski argumnt mein string hoga

//    also another example

//    abh jaise mene kiss ke argumnt paas karee jaise
//    void batman(int a,int b)
//{
//
// sout("1");

// }

//    void batman(int a){
//
//    sout("2");
//
//
//
//    }

//    and phit mene likha temp.batman(10,20)

//    toh abh yeh first vallee ko chalega kyuki usme
//    mene two integers paas ker rakhe haui
//
//
//    and yahi mene abh yahi ager likha hotha
//
//    temp.batman(10)

//    toh abh yeh first valllee ko chalatha


//    bas yahi has polymorphism argument ke according and same class
//    mein honna chahiye


    void batman(int a) {
        System.out.println("heyaa");

    }

    void batman() {
        System.out.println("heeee");
    }

    public static void main(String[] args) {
        _2_POLYMORPHISM n = new _2_POLYMORPHISM();
        n.batman(69);

    }
}
