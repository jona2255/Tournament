package com.company.manager;

import com.company.model.Result;

import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class ClasificationManager {


    public void clasificationTeams() {



    }


    public void clasificationParticipants() throws IOException {


        HashMap <String, Integer> clasificationParticipants = new HashMap<>();

        List<Result> results = ResultManager.listResult();

        for(Result result : results){

            if(result.resultLocal > result.resultVisitor){

                clasificationParticipants.put(result.participantLocal, +3);
                clasificationParticipants.put(result.participantVisitor, +0);


            } else if (result.resultLocal == result.resultVisitor){

                clasificationParticipants.put(result.participantLocal, +1);
                clasificationParticipants.put(result.participantVisitor, +1);

            } else if (result.resultLocal < result.resultVisitor){

                clasificationParticipants.put(result.participantLocal, +0);
                clasificationParticipants.put(result.participantVisitor, +3);

            }

        }

        System.out.println();

        while (clasificationParticipants.size() != 0){

            int max = 0;
            String clave = "";

            for(String key : clasificationParticipants.keySet()){
                int val = clasificationParticipants.get(key);

                if(val > max){
                    // guardar max, y la key de max
                    max = val;
                    clave = key;

                } else if (val == max){

                    clave = key;
                }
            }

            System.out.println("Participante: " + clave + " - Puntos: " + max);
            clasificationParticipants.remove(clave, max);

        }




        /*


        mientras el hash no este vaci
            buscar el que tiene mas puntos

            mostrarlo

            eliminarlo
         */






    }

    /*
      key:        juan   pepe   luis
      value:       10     11      23


      pos:         0     1    2
      value:      10    11   23

     */


}
