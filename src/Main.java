public class Main {
    public static void main(String[] args) {

        Kopek ilkKopegim = new Kopek(" Suzy " ," Golden " ,10);

        System.out.println("Kopegimin adi " + ilkKopegim.getIsim() + " cinsi "
                + ilkKopegim.getCins() + " ve yasi " + ilkKopegim.getYas());

        ilkKopegim.setIsim(" Karabas ");

        System.out.println(" Kopegimin yeni ismi " + ilkKopegim.getIsim());

        ilkKopegim.sesCikar();
        ilkKopegim.uyku();

        Kedi kedi= new Kedi("Pamuk" ,"Tekir" ,3);
        kedi.sesCikar();
        kedi.uyku();
    }
}