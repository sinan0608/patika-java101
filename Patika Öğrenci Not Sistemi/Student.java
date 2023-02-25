public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya ,int matsozlu ,int fiziksozlu ,int kimyasozlu) {

        if ((mat >= 0 && mat <= 100) && (matsozlu>=0 && matsozlu<=100)) {
            this.mat.note = mat;
            this.mat.sozlu = matsozlu;
        }

        if ((fizik >= 0 && fizik <= 100)&& (fiziksozlu>=0 && fiziksozlu<=100)) {
            this.fizik.note = fizik;
            this.fizik.sozlu = fiziksozlu;
        }

        if ((kimya >= 0 && kimya <= 100)&& (kimyasozlu>=0 && kimyasozlu<=100)) {
            this.kimya.note = kimya;
            this.kimya.sozlu = kimyasozlu;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
    public void sozluEtkisi() {
    	System.out.println("Matematik sozlu etkisi :%10\n"+"Fizik sozlu etkisi :%20\n"+"Kimya sozlu etkisi :%30\n");
    }
   

    public void calcAvarage() {
        this.avarage = ((this.fizik.note*0.8+this.fizik.sozlu*0.2) + 
        		(this.kimya.note*0.7+this.kimya.sozlu*0.3 )+ 
        		(this.mat.note*0.9+this.mat.sozlu*0.1)) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
       
    }

}

