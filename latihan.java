public class latihan{

    

/**
     * 
     */
    public static void main(String[]args){

        //Membuat Objek
        final person Saya = new person();
        final person Dia = new person();

        //Memanggil atribut yang sudah dibuat pada file Public_Class_Person.java
        Saya.nama = "Anton";
        Saya.jeniskelamin = "Pria";
        Saya.umur = 21;
        Dia.nama = "Riko";
        Dia.jeniskelamin = "Pria";
        Dia.umur = 20 ;
        System.out.println("========================");
        System.out.println("Nama            : "+ Saya.nama);
        System.out.println("Jenis Kelamin   : "+ Saya.jeniskelamin);
        System.out.println("Umur            : "+ Saya.umur);
        System.out.println("========================");
        System.out.println("Nama            : "+ Dia.nama);
        System.out.println("Jenis Kelamin   : "+ Dia.jeniskelamin);
        System.out.println("Umur            : "+ Dia.umur);
    }
}

