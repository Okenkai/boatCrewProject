import business.BoatBusinessImpl;
import business.CaptainBusinessImpl;
import business.SeamanBusinessImpl;
import business.ViceCaptainBusinessImpl;
import helper.Helper;
import model.Boat;
import model.Captain;
import model.Seaman;
import model.ViceCaptain;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main (String[] args) {

        SeamanBusinessImpl seamanBusiness = new SeamanBusinessImpl();
        List<Seaman> SeamanList = seamanBusiness.getList();
        Optional<Seaman> strawHatsSeaman = seamanBusiness.get("Jimbei the seas paladin");

        /** Return list of all Seaman **/
        System.out.println("/******* Return list of all Seaman *********/");
        Helper.generateJson(SeamanList);
        /** Return Seaman filtered by Name **/
        System.out.println("/******* Return Seaman filtered by Name *********/");
        Helper.generateJson(strawHatsSeaman);

        ViceCaptainBusinessImpl viceCaptainBusiness = new ViceCaptainBusinessImpl();
        List<ViceCaptain> viceCaptains = viceCaptainBusiness.getList();
        Optional<ViceCaptain> strawHatsViceCaptain = viceCaptainBusiness.get("Zorro the bounty hunter");

        /** Return list of all Vice Captain **/
        //System.out.println("/******* Return list of all Vice Captaine *********/");
        //Helper.generateJson(viceCaptains);
        /** Return Vice Captain filtered by Name **/
        //System.out.println("/******* Return Vice Captain filtered by Name *********/");
        //Helper.generateJson(strawHatsViceCaptain);

        CaptainBusinessImpl captainBusiness = new CaptainBusinessImpl();
        List<Captain> captains = captainBusiness.getList();
        Optional<Captain> strawHatsCaptain = captainBusiness.get("Monkey D Luffy");

        /** Return list of all Captain **/
        //System.out.println("/******* Return Captain filtered by Name *********/");
        //Helper.generateJson(captains);
        /** Return Captain filtered by Name **/
        //System.out.println("/******* Return Captain filtered by Name *********/");
        //Helper.generateJson(strawHatsCaptain);

        BoatBusinessImpl boatBusiness = new BoatBusinessImpl();
        List<Boat> boats = boatBusiness.getList();
        Optional<Boat> strawHatsBoat = boatBusiness.get("Thousand Sunny");

        /** Return list of all Boat **/
        //System.out.println("/******* Return list of all Boat *********/");
        //Helper.generateJson(boats);
        /** Return Boat filtered by Name **/
        //System.out.println("/******* Return Boat filtered by Name *********/");
        //Helper.generateJson(strawHatsBoat);

    }
}
