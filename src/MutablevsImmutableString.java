public class MutablevsImmutableString {
    public static void main(String[] args)
    {
        String name = "Ajay";
        name = name + " Sarwade";
        //adhichya String la Ajay nav ahe pn to ata change nahi honar...
        //mhnun Ajay Sarwade ha punha 1 new object create hoto...
        System.out.println(name);

        //Ajay ya variable chi value change krun Ajay Sarwade krto ahot as String ya case mdhe hot nahi...

        String s1 = new String("Java");
        //jr me explicitly create  kela object tr to string pool chya baher heap memory mdhe create hoto...
        String s2 = "Java";
        String s3 = "Java";
        boolean result = s1.equals(s2);
        boolean result1 = s2.equals(s3);
        //ithe 2 vegle object create hot nahit heap memory mdhe...2 references tayar hotat stack mdhe
        //s1 and s2 he references create hotat stack mdhe pn object ekch tayar hoto...

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(result);
        System.out.println(result1);
        //Heap memory mdhe 1 special area asto String constant pool navacha...
        //Ekda create keleli String apn change kru shkt nahi...

        //line 10 mdhe s1=Java ahe...mg JVM check krnar String constant pool mdhe ki Java ahe ka?
        //Java nahiye mhnun tithe Java ha object create honar and 1 address assign honar...

        //line 11 la s2 sathi punha check karayla janar String constant pool mdhe Java ahe ka?
        //Java ahe mhnun toch address assign honar punha s2 la...

            StringBuilder s = new StringBuilder("Ajay");

            s.append("SArwade");

        //Mutable String = which can Change
        //Immutable String = which cannot change...
        //Basically Bydefault Strings are Immutable...

        //mla jr ashi string use karaychi asel jyachi value me change kru shkto tr tyasathi 2 vegle class ahet...
        //String Buffer / String Builder
    }

}
