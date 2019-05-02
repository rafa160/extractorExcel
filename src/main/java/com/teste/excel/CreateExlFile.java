package com.teste.excel;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import com.teste.excel.models.Usuario;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CreateExlFile {

    private static final String nomeDoArquivo = "/home/rafaelpaz/Downloads/teste.xls";

    public static void main(String[] args) throws IOException {

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet folhaUsuarios = workbook.createSheet("Usuarios");

        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        listaUsuarios.add(new Usuario("Rafael","rafael@gmail.com", 8, 9, 0, false));
        listaUsuarios.add(new Usuario("Efra","rafael@gmail.com", 10, 9, 0, false));
        listaUsuarios.add(new Usuario("Banhos","rafael@gmail.com", 8, 9, 0, false));
        listaUsuarios.add(new Usuario("Joao","rafael@gmail.com", 7, 3, 0, false));

        int numeroDaLinha = 0;
        for(Usuario usuario : listaUsuarios) {

            Row linha = folhaUsuarios.createRow(numeroDaLinha++);

            int numeroCelula = 0;
            Cell nome = linha.createCell(numeroCelula++);
            nome.setCellValue(usuario.getNome());
            Cell email = linha.createCell(numeroCelula++);
            email.setCellValue(usuario.getEmail());
            Cell nota1 = linha.createCell(numeroCelula++);
            nota1.setCellValue(usuario.getNota1());
            Cell nota2 = linha.createCell(numeroCelula++);
            nota2.setCellValue(usuario.getNota2());
            Cell media = linha.createCell(numeroCelula++);
            media.setCellValue((usuario.getNota1() + usuario.getNota2()) / 2);
            Cell aprovado = linha.createCell(numeroCelula++);
            aprovado.setCellValue(media.getNumericCellValue() >= 7);

        }

        try {
            FileOutputStream out = new FileOutputStream(new File(CreateExlFile.nomeDoArquivo));
            workbook.write(out);
            out.close();
            System.out.println("Arquivo criado com sucesso!");
        } catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("Arquivo não encontrado!");
        } catch (IOException e ){
            e.printStackTrace();
            System.out.println("Erro na edição do Arquivo!");
        }



    }

    }

