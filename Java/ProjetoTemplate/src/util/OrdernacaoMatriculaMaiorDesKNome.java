/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package util;
//
//import model.Aluno;
//
///**
// *
// * @author Veronika
// */
//public class OrdernacaoMatriculaMaiorDesKNome extends ClasseOrdenacao{
//    @Override
//    public boolean compara(Aluno a, Aluno b) {
//        String[] aa = {a.getTitulacao(), a.getNome()};
//        String[] bb = {b.getTitulacao(), b.getNome()};
//        
//        for (int i = 0; i < bb.length; i++) {
//            if(aa[i].compareToIgnoreCase(bb[i]) < 0) return true;
//            else if(aa[i].compareToIgnoreCase(bb[i]) > 0) return false;
//        }
//        return true;
//    }
//}