package com.company.view.RESULTS;

import com.company.manager.ResultManager;
import com.company.model.Result;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ListResultStage {

    void show() throws IOException {
        Scanner scanner = new Scanner(System.in);

            System.out.println("LISTA:");

            List<Result> results = ResultManager.listResult();

            for(Result result : results){
                System.out.println("Participante local:" + result.participantLocal + "  " + "Resultado:" + result.resultLocal + "  " + "Participante visitante::" + result.participantVisitor + "  " + "Resultado:" + result.resultVisitor);
            }
        }
}
