package com.fges.ckonsoru;

import java.sql.Timestamp;

public interface Request {
    public Request getInstanceXML();
    
    public Request getInstanceBDD();

    public void afficherCreneaux(int year, int month, int day);

    public void afficheRDVCli(String nomcli);

    // TODO : mettre en commun la méthode prendreRdv dans XMLRequests et BDDRequests
    public void prendreRdv(String date, String N_Veto, String N_Client);
    public void prendreRdv(Timestamp daterdv, String nomveto, String nomcli);

    // TODO : mettre en commun la méthode supprRdv dans XMLRequests et BDDRequests
    public void supprRdv(String date, String N_Client);
    public void supprRdv(String nomcli, Timestamp daterdv);
}
