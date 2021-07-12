package controller;

import input.Inputsewabuku; /*Memanggil file InputanSewaBuku.java dalam Package Input*/
import model.TabelSewaBuku; /*Memanggil file TabelSewaBuku.java dalam Package Model*/
import model.Mtable; /* Memanggil file mTable.java dalam Package Model*/
import sewa_buku.Gui_persewaan_buku; /*Memanggil maingui.java dalam Package */
import java.util.List; /*Untuk memanggil package list pada java*/
import interfaces.Interfacesewabuku; /*Memanggil file InterfacesSewaBuku.java dalam Package Interfaces*/

public class Contsewabuku{
    
    public Contsewabuku(Gui_persewaan_buku _tampil){
        this._tampilan = _tampil;
        Interfacesewabuku = new Inputsewabuku();
    }
    
        public void IsiTable(){
      list_sewaBuku = Interfacesewabuku.GetAll();
      TabelSewaBuku tabelSewaBuku = new TabelSewaBuku(list_sewaBuku);
      _tampilan.GetTabelData().setModel(tabelSewaBuku);
        
    }
       
       Gui_persewaan_buku _tampilan;
       Interfacesewabuku Interfacesewabuku;
       List<Mtable> list_sewaBuku;
}