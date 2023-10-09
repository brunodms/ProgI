package Computador;

import Computador.Pecas.PlacaMae;
import Computador.Pecas.PlacaVideo;
import Computador.Pecas.Processador;

public class Main {
    public static void main(String[] args) {
         System.out.println("Placa Mãe\n");

        PlacaMae placaMae = new PlacaMae("Tuf Gaming B760-Plus", "ASUS", 983.62, "LGA 1700", 4, 2);
        System.out.println("Nome da placa-mãe: " + placaMae.getNome());
        System.out.println("Marca da placa-mãe: " + placaMae.getMarca());
        System.out.println("Preço da placa-mãe: " + placaMae.getPreco());
        System.out.println("Socket da placa mãe: " + placaMae.getSocket());
        System.out.println("Número de slots de memória da placa-mãe: " + placaMae.getSlotRAM());
        System.out.println("Número de slots de M2 da placa-mãe: " + placaMae.getSlotM2());

         System.out.println("\nMemória RAM\n");

        Processador processador = new Processador("Core i5 13600KF", "Intel", 1562.22, 14, "LGA 1700", 2.6);
        System.out.println("Nome da processador: " + processador.getNome());
        System.out.println("Marca da processador: " + processador.getMarca());
        System.out.println("Preço da processador: " + processador.getPreco());;
        System.out.println("Número de núcleos do processador: " + processador.getNucleos());
        System.out.println("Socket do processador: " + processador.getSocket());
        System.out.println("Clock do processador: " + processador.getClock());

        if(placaMae.getSocket() == processador.getSocket()){
            System.out.println("\nEste processador é compativel com a placa mãe");
        }else{
            System.out.println("\nEste processador não é compativel com a placa mãe");
        }

        System.out.println("\nPlaca de Vídeo\n");

        PlacaVideo placaVideo = new PlacaVideo("NVIDIA GeForce RTX 4060", "MSI", 1888.34, 2505, 8, "GDDR6");
        System.out.println("Nome da placa de vídeo: " + placaVideo.getNome());
        System.out.println("Marca da placa de vídeo: " + placaVideo.getMarca());
        System.out.println("Preço da placa de vídeo: " + placaVideo.getPreco());
        System.out.println("Clock da placa de vídeo: " + placaVideo.getClock());
        System.out.println("Quantidade de memória da placa de vídeo: " + placaVideo.getMemoria());
        System.out.println("Tipo de Memória da placa de vídeo: " + placaVideo.getTpMemoria());
    }
}
