import com.sun.jna.Library;
import com.sun.jna.Native;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.sound.sampled.*;
import java.awt.Color;

public class menu {

    public static Scanner TECLADO = new Scanner(System.in);

    //COMEÇA O JOGO DEPOIS DO MENU!!!!
    //TELA PRETAAAAAAAAAAAAAAAA!!!!!!!!!
    public static void abrirImagem() {
        try {
            File arquivo = new File("images.png");
            if (!arquivo.exists()) {
                System.out.println("Arquivo não encontrado em: " + arquivo.getAbsolutePath());
                return;
            }
            BufferedImage imagemOriginal = ImageIO.read(arquivo);
            if (imagemOriginal == null) {
                System.out.println("O arquivo não pôde ser lido como imagem.");
                return;
            }
            int novaLargura = imagemOriginal.getWidth() * 1;
            int novaAltura = imagemOriginal.getHeight() * 1;
            Image imagemRedimensionada = imagemOriginal.getScaledInstance(novaLargura, novaAltura, Image.SCALE_SMOOTH);
            janelas = new JFrame("Visualizador de Imagem - " + arquivo.getName());
            janelas.setUndecorated(true);
            janelas.setAlwaysOnTop(true);
            janelas.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            ImageIcon icone = new ImageIcon(imagemRedimensionada);
            JLabel label = new JLabel(icone);
            janelas.add(label);
            janelas.pack();
            janelas.setLocationRelativeTo(null);
            janelas.setVisible(true);
        } catch (IOException e) {
            System.out.println("Erro ao carregar a imagem: " + e.getMessage());
        }
    }

    public static double segundosPassados() {
        long agora = System.currentTimeMillis();
        return (agora - iniciarCronometro) / 1000.0;
    }

    //while dar uma pausa para respirar, de 10 milissegundos
    public static void esperar(int milissegundos){
        try {
            Thread.sleep(milissegundos);
        } catch (InterruptedException e) {
        }
    }

    //fecha a janela depois do tempo proposto
    public static void fecharJanela(){
       if (janelas != null) {
            janelas.setVisible(false);
            janelas.dispose();
            janelas = null;
        }
    }

    static JFrame janelas = null;

    //CRONOMETROOOOOO!!!!!
    public static void iniciarCronometro() {
        iniciarCronometro = System.currentTimeMillis();
    }

    static long iniciarCronometro = 0;

    //IMAGEM DA CIDADEEEEEEE!!!!!!
    public static void abrirImagem1() {
        try {
            File arquivo = new File("pixel.png");
            if (!arquivo.exists()) {
                System.out.println("Arquivo não encontrado em: " + arquivo.getAbsolutePath());
                return;
            }
            BufferedImage imagemOriginal = ImageIO.read(arquivo);
            if (imagemOriginal == null) {
                System.out.println("O arquivo não pôde ser lido como imagem.");
                return;
            }
            int novaLargura = imagemOriginal.getWidth() * 6;
            int novaAltura = imagemOriginal.getHeight() * 6;
            Image imagemRedimensionada = imagemOriginal.getScaledInstance(novaLargura, novaAltura, Image.SCALE_SMOOTH);
            janelas = new JFrame("Visualizador de Imagem - " + arquivo.getName());
            janelas.setUndecorated(true);
            janelas.setAlwaysOnTop(true);
            janelas.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            ImageIcon icone = new ImageIcon(imagemRedimensionada);
            JLabel label = new JLabel(icone);
            janelas.add(label);
            janelas.pack();
            janelas.setLocationRelativeTo(null);
            janelas.setVisible(true);
        } catch (IOException e) {
            System.out.println("Erro ao carregar a imagem: " + e.getMessage());
        }
    }

    //NOTICA DO CRIMEEEEE!!!!!!!
    public static void abrirImagemNoticiaCrime() {
        try {
            File arquivo = new File("noticiaCrime.png");
            if (!arquivo.exists()) {
                System.out.println("Arquivo não encontrado em: " + arquivo.getAbsolutePath());
                return;
            }
            BufferedImage imagemOriginal = ImageIO.read(arquivo);
            if (imagemOriginal == null) {
                System.out.println("O arquivo não pôde ser lido como imagem.");
                return;
            }
            int novaLargura = imagemOriginal.getWidth() / 2;
            int novaAltura = imagemOriginal.getHeight() / 2;
            Image imagemRedimensionada = imagemOriginal.getScaledInstance(novaLargura, novaAltura, Image.SCALE_SMOOTH);
            janelas = new JFrame("Visualizador de Imagem - " + arquivo.getName());
            janelas.setUndecorated(true);
            janelas.setAlwaysOnTop(true);
            janelas.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            ImageIcon icone = new ImageIcon(imagemRedimensionada);
            JLabel label = new JLabel(icone);
            janelas.add(label);
            janelas.pack();
            janelas.setLocationRelativeTo(null);
            janelas.setVisible(true);
        } catch (IOException e) {
            System.out.println("Erro ao carregar a imagem: " + e.getMessage());
        }
    }

    //DEPOIMENTOS!!!!!
    public static void abrirImagemDepoimentos() {
        try {
            File arquivo = new File("depoimentos.png");
            if (!arquivo.exists()) {
                System.out.println("Arquivo não encontrado em: " + arquivo.getAbsolutePath());
                return;
            }
            BufferedImage imagemOriginal = ImageIO.read(arquivo);
            if (imagemOriginal == null) {
                System.out.println("O arquivo não pôde ser lido como imagem.");
                return;
            }
            int novaLargura = imagemOriginal.getWidth() / 2;
            int novaAltura = imagemOriginal.getHeight() / 2;
            Image imagemRedimensionada = imagemOriginal.getScaledInstance(novaLargura, novaAltura, Image.SCALE_SMOOTH);
            janelas = new JFrame("Visualizador de Imagem - " + arquivo.getName());
            janelas.setUndecorated(true);
            janelas.setAlwaysOnTop(true);
            janelas.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            ImageIcon icone = new ImageIcon(imagemRedimensionada);
            JLabel label = new JLabel(icone);
            janelas.add(label);
            janelas.pack();
            janelas.setLocationRelativeTo(null);
            janelas.setVisible(true);
        } catch (IOException e) {
            System.out.println("Erro ao carregar a imagem: " + e.getMessage());
        }
    }

    //DEPOIMENTOOOOOOOOOOSSSSSSSSSSSS 2!!!!!
    public static void abrirImagemDepoimentos2() {
        try {
            File arquivo = new File("depoimentos2.png");
            if (!arquivo.exists()) {
                System.out.println("Arquivo não encontrado em: " + arquivo.getAbsolutePath());
                return;
            }
            BufferedImage imagemOriginal = ImageIO.read(arquivo);
            if (imagemOriginal == null) {
                System.out.println("O arquivo não pôde ser lido como imagem.");
                return;
            }
            int novaLargura = imagemOriginal.getWidth() / 2;
            int novaAltura = imagemOriginal.getHeight() / 2;
            Image imagemRedimensionada = imagemOriginal.getScaledInstance(novaLargura, novaAltura, Image.SCALE_SMOOTH);
            janelas = new JFrame("Visualizador de Imagem - " + arquivo.getName());
            janelas.setUndecorated(true);
            janelas.setAlwaysOnTop(true);
            janelas.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            ImageIcon icone = new ImageIcon(imagemRedimensionada);
            JLabel label = new JLabel(icone);
            janelas.add(label);
            janelas.pack();
            janelas.setLocationRelativeTo(null);
            janelas.setVisible(true);
        } catch (IOException e) {
            System.out.println("Erro ao carregar a imagem: " + e.getMessage());
        }
    }

    //DEPOIMENTOOOOOOOOOOSSSSSSSSSSSS 3!!!!!
    public static void abrirImagemDepoimentos3() {
        try {
            File arquivo = new File("depoimentos3.png");
            if (!arquivo.exists()) {
                System.out.println("Arquivo não encontrado em: " + arquivo.getAbsolutePath());
                return;
            }
            BufferedImage imagemOriginal = ImageIO.read(arquivo);
            if (imagemOriginal == null) {
                System.out.println("O arquivo não pôde ser lido como imagem.");
                return;
            }
            int novaLargura = imagemOriginal.getWidth() / 2;
            int novaAltura = imagemOriginal.getHeight() / 2;
            Image imagemRedimensionada = imagemOriginal.getScaledInstance(novaLargura, novaAltura, Image.SCALE_SMOOTH);
            janelas = new JFrame("Visualizador de Imagem - " + arquivo.getName());
            janelas.setUndecorated(true);
            janelas.setAlwaysOnTop(true);
            janelas.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            ImageIcon icone = new ImageIcon(imagemRedimensionada);
            JLabel label = new JLabel(icone);
            janelas.add(label);
            janelas.pack();
            janelas.setLocationRelativeTo(null);
            janelas.setVisible(true);
        } catch (IOException e) {
            System.out.println("Erro ao carregar a imagem: " + e.getMessage());
        }
    }

    //SUSPEITAS!!!!!!!!
    public static void abrirImagemSuspeitas() {
        try {
            File arquivo = new File("suspeitas.png");
            if (!arquivo.exists()) {
                System.out.println("Arquivo não encontrado em: " + arquivo.getAbsolutePath());
                return;
            }
            BufferedImage imagemOriginal = ImageIO.read(arquivo);
            if (imagemOriginal == null) {
                System.out.println("O arquivo não pôde ser lido como imagem.");
                return;
            }
            int novaLargura = imagemOriginal.getWidth() / 2;
            int novaAltura = imagemOriginal.getHeight() / 2;
            Image imagemRedimensionada = imagemOriginal.getScaledInstance(novaLargura, novaAltura, Image.SCALE_SMOOTH);
            janelas = new JFrame("Visualizador de Imagem - " + arquivo.getName());
            janelas.setUndecorated(true);
            janelas.setAlwaysOnTop(true);
            janelas.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            ImageIcon icone = new ImageIcon(imagemRedimensionada);
            JLabel label = new JLabel(icone);
            janelas.add(label);
            janelas.pack();
            janelas.setLocationRelativeTo(null);
            janelas.setVisible(true);
        } catch (IOException e) {
            System.out.println("Erro ao carregar a imagem: " + e.getMessage());
        }
    }

    //SUSPEITOOOOOSSSSS 2!!!!!!!!
    public static void abrirImagemSuspeitos2() {
        try {
            File arquivo = new File("suspeitos2.png");
            if (!arquivo.exists()) {
                System.out.println("Arquivo não encontrado em: " + arquivo.getAbsolutePath());
                return;
            }
            BufferedImage imagemOriginal = ImageIO.read(arquivo);
            if (imagemOriginal == null) {
                System.out.println("O arquivo não pôde ser lido como imagem.");
                return;
            }
            int novaLargura = imagemOriginal.getWidth() / 2;
            int novaAltura = imagemOriginal.getHeight() / 2;
            Image imagemRedimensionada = imagemOriginal.getScaledInstance(novaLargura, novaAltura, Image.SCALE_SMOOTH);
            janelas = new JFrame("Visualizador de Imagem - " + arquivo.getName());
            janelas.setUndecorated(true);
            janelas.setAlwaysOnTop(true);
            janelas.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            ImageIcon icone = new ImageIcon(imagemRedimensionada);
            JLabel label = new JLabel(icone);
            janelas.add(label);
            janelas.pack();
            janelas.setLocationRelativeTo(null);
            janelas.setVisible(true);
        } catch (IOException e) {
            System.out.println("Erro ao carregar a imagem: " + e.getMessage());
        }
    }

    //SUSPEITOOOOOSSSSS 3!!!!!!!!
    public static void abrirImagemSuspeitos3() {
        try {
            File arquivo = new File("suspeitos3.png");
            if (!arquivo.exists()) {
                System.out.println("Arquivo não encontrado em: " + arquivo.getAbsolutePath());
                return;
            }
            BufferedImage imagemOriginal = ImageIO.read(arquivo);
            if (imagemOriginal == null) {
                System.out.println("O arquivo não pôde ser lido como imagem.");
                return;
            }
            int novaLargura = imagemOriginal.getWidth() / 2;
            int novaAltura = imagemOriginal.getHeight() / 2;
            Image imagemRedimensionada = imagemOriginal.getScaledInstance(novaLargura, novaAltura, Image.SCALE_SMOOTH);
            janelas = new JFrame("Visualizador de Imagem - " + arquivo.getName());
            janelas.setUndecorated(true);
            janelas.setAlwaysOnTop(true);
            janelas.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            ImageIcon icone = new ImageIcon(imagemRedimensionada);
            JLabel label = new JLabel(icone);
            janelas.add(label);
            janelas.pack();
            janelas.setLocationRelativeTo(null);
            janelas.setVisible(true);
        } catch (IOException e) {
            System.out.println("Erro ao carregar a imagem: " + e.getMessage());
        }
    }

    //ASSASSINATO!!!!!
    public static void abrirImagemAssassinato() {
        try {
            File arquivo = new File("noticiaAssassinato.png");
            if (!arquivo.exists()) {
                System.out.println("Arquivo não encontrado em: " + arquivo.getAbsolutePath());
                return;
            }
            BufferedImage imagemOriginal = ImageIO.read(arquivo);
            if (imagemOriginal == null) {
                System.out.println("O arquivo não pôde ser lido como imagem.");
                return;
            }
            int novaLargura = imagemOriginal.getWidth() / 2;
            int novaAltura = imagemOriginal.getHeight() / 2;
            Image imagemRedimensionada = imagemOriginal.getScaledInstance(novaLargura, novaAltura, Image.SCALE_SMOOTH);
            janelas = new JFrame("Visualizador de Imagem - " + arquivo.getName());
            janelas.setUndecorated(true);
            janelas.setAlwaysOnTop(true);
            janelas.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            ImageIcon icone = new ImageIcon(imagemRedimensionada);
            JLabel label = new JLabel(icone);
            janelas.add(label);
            janelas.pack();
            janelas.setLocationRelativeTo(null);
            janelas.setVisible(true);
        } catch (IOException e) {
            System.out.println("Erro ao carregar a imagem: " + e.getMessage());
        }
    }

    //NOTICIA ASSASSINATOOOOOOOOOO 2!!!!!!!!!!!!
    public static void abrirImagemAssassinato2() {
        try {
            File arquivo = new File("noticiaAssassinato2.png");
            if (!arquivo.exists()) {
                System.out.println("Arquivo não encontrado em: " + arquivo.getAbsolutePath());
                return;
            }
            BufferedImage imagemOriginal = ImageIO.read(arquivo);
            if (imagemOriginal == null) {
                System.out.println("O arquivo não pôde ser lido como imagem.");
                return;
            }
            int novaLargura = imagemOriginal.getWidth() / 2;
            int novaAltura = imagemOriginal.getHeight() / 2;
            Image imagemRedimensionada = imagemOriginal.getScaledInstance(novaLargura, novaAltura, Image.SCALE_SMOOTH);
            janelas = new JFrame("Visualizador de Imagem - " + arquivo.getName());
            janelas.setUndecorated(true);
            janelas.setAlwaysOnTop(true);
            janelas.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            ImageIcon icone = new ImageIcon(imagemRedimensionada);
            JLabel label = new JLabel(icone);
            janelas.add(label);
            janelas.pack();
            janelas.setLocationRelativeTo(null);
            janelas.setVisible(true);
        } catch (IOException e) {
            System.out.println("Erro ao carregar a imagem: " + e.getMessage());
        }
    }

    //NOTICIA ASSASSINATOOOOOOOOOO 3!!!!!!!!!!!!
    public static void abrirImagemAssassinato3() {
        try {
            File arquivo = new File("noticiaAssassinato3.png");
            if (!arquivo.exists()) {
                System.out.println("Arquivo não encontrado em: " + arquivo.getAbsolutePath());
                return;
            }
            BufferedImage imagemOriginal = ImageIO.read(arquivo);
            if (imagemOriginal == null) {
                System.out.println("O arquivo não pôde ser lido como imagem.");
                return;
            }
            int novaLargura = imagemOriginal.getWidth() / 2;
            int novaAltura = imagemOriginal.getHeight() / 2;
            Image imagemRedimensionada = imagemOriginal.getScaledInstance(novaLargura, novaAltura, Image.SCALE_SMOOTH);
            janelas = new JFrame("Visualizador de Imagem - " + arquivo.getName());
            janelas.setUndecorated(true);
            janelas.setAlwaysOnTop(true);
            janelas.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            ImageIcon icone = new ImageIcon(imagemRedimensionada);
            JLabel label = new JLabel(icone);
            janelas.add(label);
            janelas.pack();
            janelas.setLocationRelativeTo(null);
            janelas.setVisible(true);
        } catch (IOException e) {
            System.out.println("Erro ao carregar a imagem: " + e.getMessage());
        }
    }

    //VITÓRIAAA!!!!!
    public static void abrirImagemVitoria() {
        try {
            File arquivo = new File("noticiaVitoria.png");
            if (!arquivo.exists()) {
                System.out.println("Arquivo não encontrado em: " + arquivo.getAbsolutePath());
                return;
            }
            BufferedImage imagemOriginal = ImageIO.read(arquivo);
            if (imagemOriginal == null) {
                System.out.println("O arquivo não pôde ser lido como imagem.");
                return;
            }
            int novaLargura = imagemOriginal.getWidth() / 2;
            int novaAltura = imagemOriginal.getHeight() / 2;
            Image imagemRedimensionada = imagemOriginal.getScaledInstance(novaLargura, novaAltura, Image.SCALE_SMOOTH);
            janelas = new JFrame("Visualizador de Imagem - " + arquivo.getName());
            janelas.setUndecorated(true);
            janelas.setAlwaysOnTop(true);
            janelas.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            ImageIcon icone = new ImageIcon(imagemRedimensionada);
            JLabel label = new JLabel(icone);
            janelas.add(label);
            janelas.pack();
            janelas.setLocationRelativeTo(null);
            janelas.setVisible(true);
        } catch (IOException e) {
            System.out.println("Erro ao carregar a imagem: " + e.getMessage());
        }
    }

    //VITÓRIAAAAAA 2!!!!!
    public static void abrirImagemVitoria2() {
        try {
            File arquivo = new File("noticiaVitoria2.png");
            if (!arquivo.exists()) {
                System.out.println("Arquivo não encontrado em: " + arquivo.getAbsolutePath());
                return;
            }
            BufferedImage imagemOriginal = ImageIO.read(arquivo);
            if (imagemOriginal == null) {
                System.out.println("O arquivo não pôde ser lido como imagem.");
                return;
            }
            int novaLargura = imagemOriginal.getWidth() / 2;
            int novaAltura = imagemOriginal.getHeight() / 2;
            Image imagemRedimensionada = imagemOriginal.getScaledInstance(novaLargura, novaAltura, Image.SCALE_SMOOTH);
            janelas = new JFrame("Visualizador de Imagem - " + arquivo.getName());
            janelas.setUndecorated(true);
            janelas.setAlwaysOnTop(true);
            janelas.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            ImageIcon icone = new ImageIcon(imagemRedimensionada);
            JLabel label = new JLabel(icone);
            janelas.add(label);
            janelas.pack();
            janelas.setLocationRelativeTo(null);
            janelas.setVisible(true);
        } catch (IOException e) {
            System.out.println("Erro ao carregar a imagem: " + e.getMessage());
        }
    }

    //VITÓRIAAAAAAAA 3!!!!!
    public static void abrirImagemVitoria3() {
        try {
            File arquivo = new File("noticiaVitoria3.png");
            if (!arquivo.exists()) {
                System.out.println("Arquivo não encontrado em: " + arquivo.getAbsolutePath());
                return;
            }
            BufferedImage imagemOriginal = ImageIO.read(arquivo);
            if (imagemOriginal == null) {
                System.out.println("O arquivo não pôde ser lido como imagem.");
                return;
            }
            int novaLargura = imagemOriginal.getWidth() / 2;
            int novaAltura = imagemOriginal.getHeight() / 2;
            Image imagemRedimensionada = imagemOriginal.getScaledInstance(novaLargura, novaAltura, Image.SCALE_SMOOTH);
            janelas = new JFrame("Visualizador de Imagem - " + arquivo.getName());
            janelas.setUndecorated(true);
            janelas.setAlwaysOnTop(true);
            janelas.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            ImageIcon icone = new ImageIcon(imagemRedimensionada);
            JLabel label = new JLabel(icone);
            janelas.add(label);
            janelas.pack();
            janelas.setLocationRelativeTo(null);
            janelas.setVisible(true);
        } catch (IOException e) {
            System.out.println("Erro ao carregar a imagem: " + e.getMessage());
        }
    }

    //Sorteio jenelaaa1!
    public static void janela(){
        String assassino;
        Random random = new Random();
        int resultadoDado = random.nextInt(3) + 1;
        if(resultadoDado == 1){ assassino = "Julia"; } else if(resultadoDado == 2){ assassino = "Clara"; } else { assassino = "Ana"; }
        String inputString;
        try { UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel"); } catch (Exception e) {}
        UIManager.put("OptionPane.background", Color.BLACK);
        UIManager.put("Panel.background", Color.BLACK);
        UIManager.put("OptionPane.messageForeground", Color.RED);
        UIManager.put("InternalFrame.activeTitleBackground", new Color(80, 80, 80));
        UIManager.put("InternalFrame.activeTitleForeground", Color.WHITE);
        ImageIcon iconeDetetive = new ImageIcon("detetive.png");
        ImageIcon iconeErro = new ImageIcon("x_erro.png");
        inputString =(String) JOptionPane.showInputDialog(null, "Quem é o assassino?", "O crime", JOptionPane.PLAIN_MESSAGE, iconeDetetive, null, null);
        if (inputString == null || inputString.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Operação cancelada ou nenhum nome informado.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String nomeDigitado = inputString.trim();
        if (nomeDigitado.equalsIgnoreCase("Julia") || nomeDigitado.equalsIgnoreCase("Clara") || nomeDigitado.equalsIgnoreCase("Ana")) {
            JOptionPane.showMessageDialog(null, "Você escolheu a suspeita: " + nomeDigitado, "O crime", JOptionPane.INFORMATION_MESSAGE, iconeDetetive);
            if(nomeDigitado.equalsIgnoreCase(assassino)){
                tocarSom2("recording-2026-11-21-110225.wav", false);
                abrirImagemVitoria();
            }else if(nomeDigitado != assassino){
                tocarSom2("recording-2026-11-21-110225.wav", false);
                abrirImagemAssassinato();
            }
        } else {
            JOptionPane.showMessageDialog(null, "O nome está errado! Digite apenas o nome de um suspeito correspondente (Julia, Clara ou Ana).", "Suspeito não encontrado", JOptionPane.PLAIN_MESSAGE, iconeErro);
        }
    }

    //Sorteio jenelaaa2!!!!!!!!!!!
    public static void janela2(){
        String assassino;
        Random random = new Random();
        int resultadoDado = random.nextInt(6) + 1;
        if(resultadoDado == 1){ assassino = "Caio"; } else if(resultadoDado == 2){ assassino = "Helena"; } else if(resultadoDado == 3){ assassino = "Otavio"; } else if(resultadoDado == 4){ assassino = "Clarice"; } else if(resultadoDado == 5){ assassino = "Heitor"; } else { assassino = "Olivia"; }
        String inputString;
        try { UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel"); } catch (Exception e) {}
        UIManager.put("OptionPane.background", Color.BLACK);
        UIManager.put("Panel.background", Color.BLACK);
        UIManager.put("OptionPane.messageForeground", Color.RED);
        UIManager.put("InternalFrame.activeTitleBackground", new Color(80, 80, 80));
        UIManager.put("InternalFrame.activeTitleForeground", Color.WHITE);
        ImageIcon iconeDetetive = new ImageIcon("detetive.png");
        ImageIcon iconeErro = new ImageIcon("x_erro.png");
        inputString =(String) JOptionPane.showInputDialog(null, "Quem é o assassino?", "O crime", JOptionPane.PLAIN_MESSAGE, iconeDetetive, null, null);
        if (inputString == null || inputString.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Operação cancelada ou nenhum nome informado.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String nomeDigitado = inputString.trim();
        if (nomeDigitado.equalsIgnoreCase("Caio") || nomeDigitado.equalsIgnoreCase("Helena") || nomeDigitado.equalsIgnoreCase("Otavio") || nomeDigitado.equalsIgnoreCase("Clarice") || nomeDigitado.equalsIgnoreCase("Heitor") || nomeDigitado.equalsIgnoreCase("Olivia")) {
            JOptionPane.showMessageDialog(null, "Você escolheu a suspeita: " + nomeDigitado, "O crime", JOptionPane.INFORMATION_MESSAGE, iconeDetetive);
            if(nomeDigitado.equalsIgnoreCase(assassino)){
                tocarSom2("recording-2026-11-21-110225.wav", false);
                abrirImagemVitoria2();
            }else if(nomeDigitado != assassino){
                tocarSom2("recording-2026-11-21-110225.wav", false);
                abrirImagemAssassinato2();
            }
        } else {
            JOptionPane.showMessageDialog(null, "O nome está errado! Digite apenas o nome de um suspeito correspondente (Julia, Clara ou Ana).", "Suspeito não encontrado", JOptionPane.PLAIN_MESSAGE, iconeErro);
        }
    }

    //Sorteio jenelaaa3!!!!!!!!!!!
    public static void janela3(){
        String assassino;
        Random random = new Random();
        int resultadoDado = random.nextInt(9) + 1;
        if(resultadoDado == 1){ assassino = "Leandro"; } else if(resultadoDado == 2){ assassino = "Tatiana"; } else if(resultadoDado == 3){ assassino = "Fabio"; } else if(resultadoDado == 4){ assassino = "Simone"; } else if(resultadoDado == 5){ assassino = "Sergio"; } else if(resultadoDado == 6){ assassino = "Vanessa"; } else if(resultadoDado == 7){ assassino = "Adriano"; } else if(resultadoDado == 8){ assassino = "Patricia"; } else { assassino = "Claudio"; }
        String inputString;
        try { UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel"); } catch (Exception e) {}
        UIManager.put("OptionPane.background", Color.BLACK);
        UIManager.put("Panel.background", Color.BLACK);
        UIManager.put("OptionPane.messageForeground", Color.RED);
        UIManager.put("InternalFrame.activeTitleBackground", new Color(80, 80, 80));
        UIManager.put("InternalFrame.activeTitleForeground", Color.WHITE);
        ImageIcon iconeDetetive = new ImageIcon("detetive.png");
        ImageIcon iconeErro = new ImageIcon("x_erro.png");
        inputString =(String) JOptionPane.showInputDialog(null, "Quem é o assassino?", "O crime", JOptionPane.PLAIN_MESSAGE, iconeDetetive, null, null);
        if (inputString == null || inputString.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Operação cancelada ou nenhum nome informado.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String nomeDigitado = inputString.trim();
        if (nomeDigitado.equalsIgnoreCase("Leandro") || nomeDigitado.equalsIgnoreCase("Tatiana") || nomeDigitado.equalsIgnoreCase("Fabio") || nomeDigitado.equalsIgnoreCase("Simone") || nomeDigitado.equalsIgnoreCase("Sergio") || nomeDigitado.equalsIgnoreCase("Vanessa") || nomeDigitado.equalsIgnoreCase("Adriano") || nomeDigitado.equalsIgnoreCase("Patricia") || nomeDigitado.equalsIgnoreCase("Claudio")) {
            JOptionPane.showMessageDialog(null, "Você escolheu a suspeita: " + nomeDigitado, "O crime", JOptionPane.INFORMATION_MESSAGE, iconeDetetive);
            if(nomeDigitado.equalsIgnoreCase(assassino)){
                tocarSom2("recording-2026-11-21-110225.wav", false);
                abrirImagemVitoria3();
            }else if(nomeDigitado != assassino){
                tocarSom2("recording-2026-11-21-110225.wav", false);
                abrirImagemAssassinato3();
            }
        } else {
            JOptionPane.showMessageDialog(null, "O nome está errado! Digite apenas o nome de um suspeito correspondente (Julia, Clara ou Ana).", "Suspeito não encontrado", JOptionPane.PLAIN_MESSAGE, iconeErro);
        }
    }

    //LE O QUE A PESSOA DIGITOUUUUU!!!!!!
    public static String lerSenhaDigitada() {
        String inputString;
        while (true) {
            inputString = JOptionPane.showInputDialog(null, "Digite os 2 números da senha juntos (de 1 a 2):", "Acerte a senha", JOptionPane.QUESTION_MESSAGE);
            if (inputString == null) {
                JOptionPane.showMessageDialog(null, "Você não pode sair sem abrir o cofre!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                continue;
            }
            if (inputString.length() != 2) {
                JOptionPane.showMessageDialog(null, "Digite exatamente 2 números (exemplo: 12).", "Tamanho inválido", JOptionPane.WARNING_MESSAGE);
                continue;
            }
            try {
                Integer.parseInt(inputString);
                return inputString;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Digite apenas números.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static boolean cofreAtivo = false;

    //SENHA DO COFREEEE!!!!!
    public static void senhaCofre() {
        cofreAtivo = true;
        Random sorteio = new Random();
        int s1 = sorteio.nextInt(2) + 1;
        int s2 = sorteio.nextInt(2) + 1;
        String senha = "" + s1 + s2;
        int acertos = 0;
        JOptionPane.showMessageDialog(null, "Descubra a senha de 2 números (cada um de 1 a 2(pode se repetir))!", "Cofre", JOptionPane.INFORMATION_MESSAGE);
        while (acertos < 2) {
            acertos = 0;
            String palpite = lerSenhaDigitada();
            if (palpite.charAt(0) == senha.charAt(0)) acertos++;
            if (palpite.charAt(1) == senha.charAt(1)) acertos++;
            JOptionPane.showMessageDialog(null, "Você destravou " + acertos + " de 2 travas!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "Parabéns! Cofre aberto!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        cofreAtivo = false;
    }

    //FECHA A JANELA DO COFREEEEEE!!!!!
    public static void fecharJogos() {
        cofreAtivo = false;
    }

    //JOGO DA ADIVINHACAOOOO!!!!
    public static void jogoAdivinhacao() {
        cofreAtivo = true;
        int secreto = new Random().nextInt(5) + 1;
        int palpite = 0, tentativas = 0;
        String inputString;
        while (palpite != secreto) {
            inputString = JOptionPane.showInputDialog(null, "Palpite (1 a 5):", "Jogo de Adivinhação", JOptionPane.QUESTION_MESSAGE);
            if (inputString == null) { continue; }
            try {
                palpite = Integer.parseInt(inputString);
                tentativas++;
                if (palpite != secreto) {
                    JOptionPane.showMessageDialog(null, palpite < secreto ? "É maior!" : "É menor!", "Dica", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Digite apenas números inteiros.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Acertou em " + tentativas + " tentativa(s)!", "Vitória", JOptionPane.INFORMATION_MESSAGE);
        cofreAtivo = false;
    }

    public static void jogoAdivinhacaoNivel2() {
        cofreAtivo = true;
        int secreto = new Random().nextInt(7) + 1;
        int palpite = 0, tentativas = 0;
        String inputString;
        while (palpite != secreto) {
            inputString = JOptionPane.showInputDialog(null, "Palpite (1 a 7):", "Jogo de Adivinhação", JOptionPane.QUESTION_MESSAGE);
            if (inputString == null) { continue; }
            try {
                palpite = Integer.parseInt(inputString);
                tentativas++;
                if (palpite != secreto) {
                    JOptionPane.showMessageDialog(null, palpite < secreto ? "É maior!" : "É menor!", "O assassino está proximo a cena de crime", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Digite apenas números inteiros.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Acertou em " + tentativas + " tentativa(s)!", "Vitória", JOptionPane.INFORMATION_MESSAGE);
        cofreAtivo = false;
    }

    //TOCA O SOM DO COMEÇOOOOO!!!!!!!
    public static void tocarSom1(String caminhoArquivoSom, boolean esperarTerminar){
        try {
            File soundFile = new File(caminhoArquivoSom);
            if (!soundFile.exists()) { System.out.println("Arquivo de som não encontrado: " + caminhoArquivoSom); return; }
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            Clip audioClip = (Clip) AudioSystem.getLine(info);
            audioClip.open(audioStream);
            audioStream.close();
            audioClip.addLineListener(evento -> { if (evento.getType() == LineEvent.Type.STOP) { audioClip.close(); } });
            audioClip.start();
            if (esperarTerminar) { Thread.sleep(audioClip.getMicrosecondLength() / 1000); }
        } catch (UnsupportedAudioFileException e) { System.err.println("O formato de áudio não é suportado."); e.printStackTrace();
        } catch (LineUnavailableException e) { System.err.println("Linha de áudio não disponível."); e.printStackTrace();
        } catch (IOException e) { System.err.println("Erro ao ler o arquivo de áudio."); e.printStackTrace();
        } catch (InterruptedException e) { System.err.println("O programa foi interrompido."); e.printStackTrace(); }
    }

    //TOCA O SOM DO FINAAAAAALLLLLLL!!!!!!!
    public static void tocarSom2(String caminhoArquivoSom, boolean esperarTerminar){
        try {
            File soundFile = new File(caminhoArquivoSom);
            if (!soundFile.exists()) { System.out.println("Arquivo de som não encontrado: " + caminhoArquivoSom); return; }
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            Clip audioClip = (Clip) AudioSystem.getLine(info);
            audioClip.open(audioStream);
            audioStream.close();
            audioClip.addLineListener(evento -> { if (evento.getType() == LineEvent.Type.STOP) { audioClip.close(); } });
            audioClip.start();
            if (esperarTerminar) { Thread.sleep(audioClip.getMicrosecondLength() / 1000); }
        } catch (UnsupportedAudioFileException e) { System.err.println("O formato de áudio não é suportado."); e.printStackTrace();
        } catch (LineUnavailableException e) { System.err.println("Linha de áudio não disponível."); e.printStackTrace();
        } catch (IOException e) { System.err.println("Erro ao ler o arquivo de áudio."); e.printStackTrace();
        } catch (InterruptedException e) { System.err.println("O programa foi interrompido."); e.printStackTrace(); }
    }

    // Liga o Java às funções _kbhit e _getch do Windows
    public interface Crt extends Library {
        Crt INSTANCE = Native.load("msvcrt", Crt.class);
        int _kbhit();
        int _getch();
    }

    static boolean windows = System.getProperty("os.name").toLowerCase().contains("win");
    static boolean tecladoPreparado = false;

    public static boolean pressionouTecla() {
        if (windows) { return Crt.INSTANCE._kbhit() != 0; }
        prepararTecladoMacLinux();
        try { return System.in.available() > 0; } catch (Exception e) { return false; }
    }

    public static int obtemTeclaPressionada() {
        if (windows) { return Crt.INSTANCE._getch(); }
        prepararTecladoMacLinux();
        try { return System.in.read(); } catch (Exception e) { return -1; }
    }

    public static void esperarTecla() {
        System.out.println("Pressione uma tecla para continuar...");
        obtemTeclaPressionada();
    }

    static void prepararTecladoMacLinux() {
        if (tecladoPreparado) { return; }
        tecladoPreparado = true;
        executarStty("-icanon -echo -icrnl min 1");
        Runtime.getRuntime().addShutdownHook(new Thread(() -> executarStty("sane")));
    }

    static void executarStty(String opcoes) {
        try { new ProcessBuilder("sh", "-c", "stty " + opcoes + " < /dev/tty").start().waitFor(); } catch (Exception e) {}
    }

    public static void limparConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void gotoXY(int linha, int coluna) {
        char escCode = 0x1B;
        System.out.print(String.format("%c[%d;%df", escCode, linha, coluna));
    }

    public static final int PRETO = 0;
    public static final int VERMELHO = 1;
    public static final int VERDE = 2;
    public static final int AMARELO = 3;
    public static final int AZUL = 4;
    public static final int MAGENTA = 5;
    public static final int CIANO = 6;
    public static final int CINZA = 7;
    public static final int BRANCO = 15;
    public static final int COR_PADRAO = -1;

    public static void mudarCor(int cor) {
        if (cor >= 0 && cor <= 255) { System.out.print("\033[38;5;" + cor + "m"); } else { System.out.print("\033[39m"); }
    }

    public static void mudarCorFundo(int cor) {
        if (cor >= 0 && cor <= 255) { System.out.print("\033[48;5;" + cor + "m"); } else { System.out.print("\033[49m"); }
    }

    public static void atualizarMenu(int opcaoSelecionada, String[] opcoes) {
        limparConsole();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("╔═════════════════════╗");
        System.out.println("║    Menu Principal   ║");
        System.out.println("╠═════════════════════╣");
        for (int i = 0; i < opcoes.length; i++) {
            if (i == opcaoSelecionada) {
                System.out.print("║> ");
                mudarCor(VERDE);
                System.out.print(opcoes[i]);
                mudarCor(COR_PADRAO);
                System.out.println("  ║");
            } else {
                System.out.println("║  " + opcoes[i] + "  ║");
            }
        }
        System.out.println("╚═════════════════════╝");
        System.out.println();
        System.out.println("Use W/S para navegar e ENTER para selecionar. ESC para sair.");
    }

    public static int lerValorDigitado() {
        String linha;
        while (true) {
            System.out.print("Digite o nivel (1, 2 ou 3): ");
            System.out.flush();
            linha = TECLADO.nextLine();
            linha = linha.trim();
            if (linha.equals("")) {
                continue;
            }
            if (linha.equals("1")) {
                return 1;
            }
            if (linha.equals("2")) {
                return 2;
            }
            if (linha.equals("3")) {
                return 3;
            }
            System.out.println("Digite um valor Valido de 1 a 3 !");
        }
    }

    public static int lervalorDigitado() {
        int valorD = lerValorDigitado();
        double inicio;
        if (valorD == 1) {
            iniciarCronometro();
            inicio = segundosPassados();
            abrirImagem1();
            tocarSom1("recording-2026-11-20-150330.wav", false);
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
            inicio = segundosPassados();
            abrirImagemNoticiaCrime();
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
            inicio = segundosPassados();
            abrirImagemDepoimentos();
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
            senhaCofre();
            fecharJogos();
            inicio = segundosPassados();
            abrirImagemDepoimentos();
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
            inicio = segundosPassados();
            abrirImagem();
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
            inicio = segundosPassados();
            abrirImagemDepoimentos();
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
            jogoAdivinhacao();
            fecharJogos();
            inicio = segundosPassados();
            abrirImagemDepoimentos();
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
            inicio = segundosPassados();
            abrirImagemSuspeitas();
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
            janela();
            inicio = segundosPassados();
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
        } else if (valorD == 2) {
            iniciarCronometro();
            inicio = segundosPassados();
            abrirImagem1();
            tocarSom1("recording-2026-11-20-150330.wav", false);
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
            inicio = segundosPassados();
            abrirImagemNoticiaCrime();
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
            inicio = segundosPassados();
            abrirImagemDepoimentos2();
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
            senhaCofre();
            fecharJogos();
            inicio = segundosPassados();
            abrirImagemDepoimentos2();
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
            inicio = segundosPassados();
            abrirImagem();
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
            inicio = segundosPassados();
            abrirImagemDepoimentos2();
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
            jogoAdivinhacaoNivel2();
            fecharJogos();
            inicio = segundosPassados();
            abrirImagemDepoimentos2();
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
            inicio = segundosPassados();
            abrirImagemSuspeitos2();
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
            janela2();
            inicio = segundosPassados();
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
        } else if (valorD == 3) {
            iniciarCronometro();
            inicio = segundosPassados();
            abrirImagem1();
            tocarSom1("recording-2026-11-20-150330.wav", false);
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
            inicio = segundosPassados();
            abrirImagemNoticiaCrime();
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
            inicio = segundosPassados();
            abrirImagemDepoimentos3();
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
            senhaCofre();
            fecharJogos();
            inicio = segundosPassados();
            abrirImagemDepoimentos3();
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
            inicio = segundosPassados();
            abrirImagem();
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
            inicio = segundosPassados();
            abrirImagemDepoimentos3();
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
            jogoAdivinhacaoNivel2();
            fecharJogos();
            inicio = segundosPassados();
            abrirImagemDepoimentos3();
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
            inicio = segundosPassados();
            abrirImagemSuspeitos3();
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
            janela3();
            inicio = segundosPassados();
            while(segundosPassados() - inicio < 10.0){ esperar(10); }
            fecharJanela();
        } else {
            System.out.println("Digite um valor Valido de 1 a 3 !");
        }
        return valorD;
    }

    public static void executarAcaoMenu(int opcaoSelecionada) {
        limparConsole();
        switch (opcaoSelecionada) {
            case 0:
                lervalorDigitado();
                break;
            case 1:
                System.out.println("Saindo do jogo...");
                esperar(1000);
                System.exit(0);
                break;
        }
    }

    public static void main(String[] args) {
        String[] opcoes = {"Jogar", "Sair"};
        int opcaoSelecionada = 0;
        atualizarMenu(opcaoSelecionada, opcoes);
        while (true) {
            if (pressionouTecla()) {
                int tecla = obtemTeclaPressionada();
                switch (tecla) {
                    case 'w':
                    case 'W':
                        if (opcaoSelecionada > 0) { opcaoSelecionada--; }
                        atualizarMenu(opcaoSelecionada, opcoes);
                        break;
                    case 's':
                    case 'S':
                        if (opcaoSelecionada < opcoes.length - 1) { opcaoSelecionada++; }
                        atualizarMenu(opcaoSelecionada, opcoes);
                        break;
                    case 13:
                        executarAcaoMenu(opcaoSelecionada);
                        atualizarMenu(opcaoSelecionada, opcoes);
                        break;
                    case 27:
                        return;
                }
            }
            esperar(10);
        }
    }
}