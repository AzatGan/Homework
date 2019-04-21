package ru.ganeev.task4;



public class Hospital {
    public static void main(String[] args) {
        Patient Michael = new Patient("Майкл","Джексон",29081958);
        Patient Freddy = new Patient("Freddy","Krueger",13051973);
        Patient Leatherface = new Patient("Bubba","Sawyer",13131975);

        Michael.setInsurance(345);

        MedicalDepartment beauties =new MedicalDepartment();
        PlasticSurgery face = new PlasticSurgery();
        face.setPatients(new Patient[]{Michael});
        beauties.setPlasticSurgeries(new PlasticSurgery[]{face});


        Freddy.setInsurance(1313);

        MedicalDepartment beauties1 =new MedicalDepartment();
        PlasticSurgery face1 = new PlasticSurgery();
        face1.setPatients(new Patient[]{Freddy});
        beauties1.setPlasticSurgeries(new PlasticSurgery[]{face1});


        Leatherface.setInsurance(131313);

        MedicalDepartment beauties2 =new MedicalDepartment();
        PlasticSurgery face2 = new PlasticSurgery();
        face2.setPatients(new Patient[]{Leatherface});
        beauties2.setPlasticSurgeries(new PlasticSurgery[]{face2});



        System.out.println(beauties);
        System.out.println(beauties1);
        System.out.println(beauties2);
    }
}
