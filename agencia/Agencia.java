/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class Agencia{

    public static void main(String[] args) {
        int opcion = 0;
        Scanner ent = new Scanner(System.in);
        llanta llantas_auto[] = new llanta[4];
        //renta rentas[] = new renta[20];
        
        ArrayList <renta> ListaRenta = new ArrayList <renta> ();
        ArrayList <automovil> ListaAutomoviles = new ArrayList <automovil> ();
        
        faros faros_auto[] = new faros[2];
        automovil autos_disponibles[] = new automovil [5];
        llantas_auto[0] = new llanta(15,"Michellin","Deportiva");
        llantas_auto[1] = new llanta(15,"Michellin","Deportiva");
        llantas_auto[2] = new llanta(15,"Michellin","Deportiva");
        llantas_auto[3] = new llanta(15,"Michellin","Deportiva");
        faros_auto[0] = new faros("Zenon","BMW");
        faros_auto[1] = new faros("Zenon","BMW");
        /*
        autos_disponibles[0] = new automovil(1,"RTS3-8FUT","Deportivo",550.50,1,new motor("34RETR-RTR",500,8),llantas_auto,faros_auto);
        autos_disponibles[1] = new automovil(2,"RTS3-8FUT","Deportivo",550.50,1,new motor("34RETR-RTR",500,8),llantas_auto,faros_auto);
        autos_disponibles[2] = new automovil(3,"RTS3-8FUT","Deportivo",550.50,1,new motor("34RETR-RTR",500,8),llantas_auto,faros_auto);
        autos_disponibles[3] = new automovil(4,"RTS3-8FUT","Deportivo",550.50,1,new motor("34RETR-RTR",500,8),llantas_auto,faros_auto);
        autos_disponibles[4] = new automovil(5,"RTS3-8FUT","Deportivo",550.50,1,new motor("34RETR-RTR",500,8),llantas_auto,faros_auto);
        */
        ListaAutomoviles.add (new automovil(1,"RTS3-8FUT","Deportivo",550.50,1,new motor("34RETR-RTR",500,8),llantas_auto,faros_auto));
        ListaAutomoviles.add (new automovil(2,"RTS3-8FUT","Deportivo",550.50,1,new motor("34RETR-RTR",500,8),llantas_auto,faros_auto));
        ListaAutomoviles.add (new automovil(3,"RTS3-8FUT","Deportivo",550.50,1,new motor("34RETR-RTR",500,8),llantas_auto,faros_auto));
        ListaAutomoviles.add (new automovil(4,"RTS3-8FUT","Deportivo",550.50,1,new motor("34RETR-RTR",500,8),llantas_auto,faros_auto));
        ListaAutomoviles.add (new automovil(5,"RTS3-8FUT","Deportivo",550.50,1,new motor("34RETR-RTR",500,8),llantas_auto,faros_auto));
        
        System.out.println("Renta de Automoviles S.A de C.V");
        
        do{
            System.out.println("Opciones disponibles \n 1.- a \n 2.- b \n 3.- c \n 4.- d \n 5.- e");
            opcion = ent.nextInt();
            switch(opcion){
                case 1:
                    for(int r = 0; r < ListaAutomoviles.size(); r++){
                        System.out.println(ListaAutomoviles.get(r).getIdautomovil() + " " + ListaAutomoviles.get(r).getPrecio_renta_diario() + " " + ListaAutomoviles.get(r).getIdentificador() + " " + ListaAutomoviles.get(r).getTipo_automovil());
                    }
                    break;
                case 2:
                    /*int conteo=0;
                    for(int r = 0; r < rentas.length; r++){
                        if(rentas[r]!=null){
                            if(rentas[r].getStatus_renta()==1){
                                persona usuario = rentas[r].getPerson();
                                System.out.println(usuario.getNombre()+" "+usuario.getNumero_licencia());
                                conteo++;
                            }
                        }
                    }
                    if (conteo==0)
                        System.out.println("No hay rentas registradas");*/
                    if(ListaRenta.isEmpty()){
                        System.out.println("No hay rentas registradas");
                    }else{
                        Iterator<renta> lrentas = ListaRenta.iterator();
                        while(lrentas.hasNext()){
                            renta r = (renta) lrentas;
                            if(r.getStatus_renta()==1){
                                persona usuario = r.getPerson();
                                System.out.println(usuario.getNombre()+" "+usuario.getNumero_licencia());
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Datos de renta: ");
                    ent.nextLine();
                    persona usuario_renta = new persona();
                    System.out.println("Nombre de persona: ");
                    usuario_renta.setNombre(ent.nextLine());
                    System.out.println("Indique dirección: ");
                    usuario_renta.setDireccion(ent.nextLine());
                    System.out.println("Indique teléfono: ");
                    usuario_renta.setNumero_telefono(ent.nextLine());
                    System.out.println("Indique tipo de sangre: ");
                    usuario_renta.setTipo_sangre(ent.nextLine());
                    System.out.println("Número de licencia: ");
                    usuario_renta.setNumero_licencia(ent.nextLine());
                    
                    automovil automovil_renta = null;
                    do{
                        int c = 0;
                        System.out.println("Indique id de automovil: ");
                        int idAutomovil = ent.nextInt();
                        //automovil_renta = getAutomovilDisponible(idAutomovil, autos_disponibles);
                        Iterator<automovil> lautos = ListaAutomoviles.iterator();
                        while(lautos.hasNext()){
                            automovil a = (automovil) lautos.next();
                            if(a.getStatus()!= 1 && a.getIdautomovil() == idAutomovil){
                                System.out.println("El automovil no está disponible");
                                break;
                            }else if(a.getStatus()==1 && a.getIdautomovil() == idAutomovil){
                                automovil_renta = a;
                                ListaAutomoviles.get(c).setStatus(2);
                                break;
                            }
                            c++;
                        }
                        
                    }while(automovil_renta == null);
                    System.out.println("Indique dias de renta: ");
                    int dias_renta = ent.nextInt();
                    renta renta_actual = new renta(usuario_renta, automovil_renta, new Date(), dias_renta, 1);
                    
                    ListaRenta.add(renta_actual);
                    break;
                case 4:
                    if(ListaRenta.isEmpty()){
                        System.out.println("No hay rentas registradas");
                    }else{
                        System.out.println("Indique id del automovil: ");
                        int idautomovil = ent.nextInt();
                        boolean verificar = false;
                        
                        for(int r = 0; r<ListaRenta.size(); r++){
                            if(ListaRenta.get(r).getAuto_renta().getIdautomovil()==idautomovil && ListaRenta.get(r).getStatus_renta()==1){
                                ListaRenta.get(r).setStatus_renta(1);
                                System.out.println("La renta se ha finalizado correctamente");
                                verificar = true;
                                break;
                            }
                        }
                        if(!verificar){
                            System.out.println("No hay concidencias");
                        }
                    }
                    break;
                case 5:
                    if(ListaAutomoviles.isEmpty()){
                        System.out.println("No hay automoviles registrados");
                    }else{    
                    for(int r = 0; r<ListaAutomoviles.size(); r++){
                            System.out.println(ListaAutomoviles.get(r).getIdentificador()+" "+ListaAutomoviles.get(r).getPrecio_renta_diario());
                        }
                    }
                    break;
                case 6:
                    if(ListaRenta.isEmpty()){
                        System.out.println("No hay rentas registrados");
                    }else{
                        Date now = new Date();
                    for(int r = 0; r<ListaRenta.size(); r++){
                        Date fecha = ListaRenta.get(r).getFecha_registro();
                        //ListaRenta.get(r).getFecha_registro();
                        if(ListaRenta.get(r).getFecha_registro().compareTo(now)==0);
                        }
                    }
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opción no disponible, intente otra opcion");
                    break;
            }
        }while(opcion !=0);
    }
    
    public static automovil getAutomovilDisponible(int id, automovil[] automoviles){
        automovil auto = null;
        for(int r=0; r<automoviles.length; r++){
            if(automoviles[r].getStatus()==1 && automoviles[r].getIdautomovil() == id){
            auto=automoviles[r];
            }
        }
        return auto;
    }
}