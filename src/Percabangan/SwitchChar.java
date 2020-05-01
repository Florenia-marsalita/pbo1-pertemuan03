package Percabangan;

public class SwitchChar {
    public static void main(String[] args) {
        char nilai= 'D';
        switch(nilai){
            case 'A':
                System.out.println("Mhs	    : \"Terima Kasih Pak\"");
                System.out.println("Dosen   : \"Selamat Yaa\"");
                break;
            case 'B':
                System.out.println("Mhs	    : \"Kenapa ulun kada dapa A, pak?\"");
                System.out.println("Dosen   : \"Sarah Bapak ae\"");
                break;
            case 'C':
                System.out.println("Mhs	    : \"Ulun turun tarus pak ae,tugas ngumpul jua\"");
                System.out.println("Dosen   : \"Tapi bisalah menjawab ujian atau kuisnya?\"");
                System.out.println("Mhs	    : \"heheheh,,anu pa ae anu\"");
                break;
            default:
                System.out.println("Mhs	    : \"Ulun turun tarus Pak ae, tugas ngumpul jua\"");
                System.out.println("Dosen   : \"Bujur jua kah ?\"");
                System.out.println("Dosen   : \"*memeriksa berkas\"");
                System.out.println("Dosen   : \"*kada sesuai\"");
                System.out.println("Mhs     : \"Anuu, angkat telpon dlu Pak lah\"");
                break;
        }
    }
}