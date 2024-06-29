import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        boolean[] User_Selection = new boolean[59];

        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 60; i++) {
            String str = Integer.toString(i + 1);
            map.put(i, "src/image/" + str + ".jpg");
        }


        JFrame frame = new JFrame("Меню");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int centerX = (screenSize.width - frame.getWidth()) / 2;
        int centerY = (screenSize.height - frame.getHeight()) / 2;
        frame.setLocation(centerX, centerY);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(new EmptyBorder(30, 0, 0, 0));

        JButton buttonA = new JButton("Аксессуары");
        buttonA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                JFrame accessoryFrame = new JFrame("Аксессуары");
                accessoryFrame.setResizable(false);
                accessoryFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                accessoryFrame.setSize(700, 500);
                accessoryFrame.setLocation(centerX, centerY);
                accessoryFrame.setLayout(new FlowLayout());

                JButton buttonHead = new JButton("Голова");
                JButton buttonLegs = new JButton("Ноги");
                JButton buttonNeck = new JButton("Шея");

                accessoryFrame.add(buttonHead);
                accessoryFrame.add(buttonLegs);
                accessoryFrame.add(buttonNeck);

                buttonHead.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        accessoryFrame.setVisible(false);
                        JFrame headFrame = new JFrame("Аксесуары на голову");
                        headFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        headFrame.setSize(700, 500);
                        headFrame.setLocation(centerX, centerY);
                        headFrame.setLayout(new FlowLayout());

                        JPanel panel = new JPanel();
                        panel.setLayout(new GridLayout(0, 1));

                        JCheckBox hatCheckBox = new JCheckBox("Шляпа");
                        JCheckBox capCheckBox = new JCheckBox("Шапка");
                        JCheckBox pcapCheckBox = new JCheckBox("Кепка");

                        panel.add(hatCheckBox);
                        panel.add(capCheckBox);
                        panel.add(pcapCheckBox);

                        headFrame.add(panel);
                        headFrame.setVisible(true);

                        headFrame.addWindowListener(new WindowAdapter() {
                            @Override
                            public void windowClosed(WindowEvent e) {
                                if (hatCheckBox.isSelected()) {
                                    User_Selection[26] = true;
                                }
                                if (capCheckBox.isSelected()) {
                                    User_Selection[7] = true;
                                    User_Selection[8] = true;
                                }
                                if (pcapCheckBox.isSelected()) {
                                    User_Selection[0] = true;
                                    User_Selection[2] = true;
                                    User_Selection[11] = true;
                                    User_Selection[24] = true;
                                }
                                accessoryFrame.setVisible(true);
                            }
                        });

                        headFrame.setVisible(true);
                    }
                });

                buttonLegs.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        accessoryFrame.setVisible(false);
                        JFrame LegsFrame = new JFrame("Аксессуары на ног");
                        LegsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        LegsFrame.setSize(700, 500);
                        LegsFrame.setLocation(centerX, centerY);
                        LegsFrame.setLayout(new FlowLayout());

                        JPanel panel = new JPanel();
                        panel.setLayout(new GridLayout(0, 1));

                        JCheckBox SocksCheckBox = new JCheckBox("Носки");
                        JCheckBox StockingsCheckBox = new JCheckBox("Чулки/гольфы");
                        JCheckBox TightsCheckBox = new JCheckBox("Колготки");

                        panel.add(SocksCheckBox);
                        panel.add(StockingsCheckBox);
                        panel.add(TightsCheckBox);

                        LegsFrame.add(panel);
                        LegsFrame.setVisible(true);

                        LegsFrame.addWindowListener(new WindowAdapter() {
                            @Override
                            public void windowClosed(WindowEvent e) {
                                if (SocksCheckBox.isSelected()) {
                                    User_Selection[0] = true;
                                    User_Selection[3] = true;
                                    User_Selection[4] = true;
                                    User_Selection[7] = true;
                                    User_Selection[9] = true;
                                    User_Selection[12] = true;
                                    User_Selection[16] = true;
                                    User_Selection[29] = true;
                                }
                                if (StockingsCheckBox.isSelected()) {
                                    User_Selection[5] = true;
                                    User_Selection[6] = true;
                                    User_Selection[14] = true;
                                    User_Selection[15] = true;
                                }
                                if (TightsCheckBox.isSelected()) {
                                    User_Selection[12] = true;
                                    User_Selection[13] = true;
                                    User_Selection[15] = true;
                                    User_Selection[28] = true;
                                }
                                accessoryFrame.setVisible(true);
                            }
                        });

                        LegsFrame.setVisible(true);
                    }
                });

                buttonNeck.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        accessoryFrame.setVisible(false);
                        JFrame NeckFrame = new JFrame("Аксессуары на шею");
                        NeckFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        NeckFrame.setSize(700, 500);
                        NeckFrame.setLocation(centerX, centerY);
                        NeckFrame.setLayout(new FlowLayout());

                        JPanel panel = new JPanel();
                        panel.setLayout(new GridLayout(0, 1));

                        JCheckBox TieCheckBox = new JCheckBox("Галстук");
                        JCheckBox HandkerchiefCheckBox = new JCheckBox("Платок");

                        panel.add(TieCheckBox);
                        panel.add(HandkerchiefCheckBox);

                        NeckFrame.add(panel);
                        NeckFrame.setVisible(true);

                        NeckFrame.addWindowListener(new WindowAdapter() {
                            @Override
                            public void windowClosed(WindowEvent e) {
                                if (TieCheckBox.isSelected()) {
                                    User_Selection[6] = true;
                                    User_Selection[16] = true;
                                }
                                if (HandkerchiefCheckBox.isSelected()) {
                                    User_Selection[17] = true;
                                    User_Selection[18] = true;
                                    User_Selection[19] = true;
                                    User_Selection[20] = true;
                                    User_Selection[21] = true;
                                }
                                accessoryFrame.setVisible(true);
                            }
                        });

                        NeckFrame.setVisible(true);
                    }


                });

                accessoryFrame.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        frame.setVisible(true);
                    }
                });

                accessoryFrame.setVisible(true);
            }
        });

        JButton buttonTop = new JButton("Верх");
        buttonTop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                JFrame topFrame = new JFrame("Верх");
                topFrame.setResizable(false);
                topFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                topFrame.setSize(700, 500);
                topFrame.setLocation(centerX, centerY);
                topFrame.setLayout(new FlowLayout());

                JButton buttonBlouse = new JButton("Блузки/рубашки");
                JButton buttonOuter = new JButton("Верхняя одежда");
                JButton buttonJacket = new JButton("Пиджаки");
                JButton buttonSweater = new JButton("Свитера");
                JButton buttonShirt = new JButton("Майки/топы");
                JButton buttonTshirt = new JButton("Футболки");

                topFrame.add(buttonBlouse);
                topFrame.add(buttonOuter);
                topFrame.add(buttonJacket);
                topFrame.add(buttonSweater);
                topFrame.add(buttonShirt);
                topFrame.add(buttonTshirt);

                buttonBlouse.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        topFrame.setVisible(false);
                        JFrame blouseFrame = new JFrame("Блузки/рубашки");
                        blouseFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        blouseFrame.setSize(700, 500);
                        blouseFrame.setLocation(centerX, centerY);
                        blouseFrame.setLayout(new FlowLayout());

                        JPanel panel = new JPanel();
                        panel.setLayout(new GridLayout(0, 1));

                        JCheckBox blouseCheckBox = new JCheckBox("Блузка");
                        JCheckBox shirtCheckBox = new JCheckBox("Рубашка");

                        panel.add(blouseCheckBox);
                        panel.add(shirtCheckBox);

                        blouseFrame.add(panel);
                        blouseFrame.setVisible(true);

                        blouseFrame.addWindowListener(new WindowAdapter() {
                            @Override
                            public void windowClosed(WindowEvent e) {
                                if (blouseCheckBox.isSelected()) {
                                    User_Selection[5] = true;
                                    User_Selection[7] = true;
                                    User_Selection[11] = true;
                                    User_Selection[12] = true;
                                    User_Selection[16] = true;
                                    User_Selection[18] = true;
                                    User_Selection[22] = true;
                                    User_Selection[23] = true;
                                    User_Selection[26] = true;
                                    User_Selection[29] = true;
                                }
                                if (shirtCheckBox.isSelected()) {
                                    User_Selection[0] = true;
                                    User_Selection[5] = true;
                                    User_Selection[14] = true;
                                    User_Selection[16] = true;
                                    User_Selection[17] = true;
                                    User_Selection[29] = true;
                                }
                                topFrame.setVisible(true);
                            }
                        });

                        blouseFrame.setVisible(true);
                    }
                });

                buttonOuter.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        topFrame.setVisible(false);
                        JFrame OuterwearFrame = new JFrame("Верхняя одежда");
                        OuterwearFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        OuterwearFrame.setSize(700, 500);
                        OuterwearFrame.setLocation(centerX, centerY);
                        OuterwearFrame.setLayout(new FlowLayout());

                        JPanel panel = new JPanel();
                        panel.setLayout(new GridLayout(0, 1));

                        JCheckBox JCheckBox = new JCheckBox("Джинсовая куртка");
                        JCheckBox LCheckBox = new JCheckBox("Кожаная куртка");

                        panel.add(JCheckBox);
                        panel.add(LCheckBox);

                        OuterwearFrame.add(panel);
                        OuterwearFrame.setVisible(true);

                        OuterwearFrame.addWindowListener(new WindowAdapter() {
                            @Override
                            public void windowClosed(WindowEvent e) {
                                if (JCheckBox.isSelected()) {
                                    User_Selection[24] = true;
                                    User_Selection[25] = true;
                                    User_Selection[26] = true;
                                }
                                if (LCheckBox.isSelected()) {
                                    User_Selection[4] = true;
                                    User_Selection[6] = true;
                                    User_Selection[27] = true;
                                    User_Selection[28] = true;
                                }
                                topFrame.setVisible(true);
                            }
                        });

                        OuterwearFrame.setVisible(true);
                    }
                });

                buttonJacket.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        topFrame.setVisible(false);
                        JFrame JacketFrame = new JFrame("Пиджаки");
                        JacketFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        JacketFrame.setSize(700, 500);
                        JacketFrame.setLocation(centerX, centerY);
                        JacketFrame.setLayout(new FlowLayout());

                        JPanel panel = new JPanel();
                        panel.setLayout(new GridLayout(0, 1));

                        JCheckBox BCheckBox = new JCheckBox("Пиджак");
                        JCheckBox VCheckBox = new JCheckBox("Жилет");

                        panel.add(BCheckBox);
                        panel.add(VCheckBox);

                        JacketFrame.add(panel);
                        JacketFrame.setVisible(true);

                        JacketFrame.addWindowListener(new WindowAdapter() {
                            @Override
                            public void windowClosed(WindowEvent e) {
                                if (BCheckBox.isSelected()) {
                                    User_Selection[11] = true;
                                    User_Selection[12] = true;
                                    User_Selection[20] = true;
                                }
                                if (VCheckBox.isSelected()) {
                                    User_Selection[6] = true;
                                    User_Selection[15] = true;
                                }
                                topFrame.setVisible(true);
                            }
                        });

                        JacketFrame.setVisible(true);
                    }
                });

                buttonSweater.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        topFrame.setVisible(false);
                        JFrame blouseFrame = new JFrame("Свитера");
                        blouseFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        blouseFrame.setSize(700, 500);
                        blouseFrame.setLocation(centerX, centerY);
                        blouseFrame.setLayout(new FlowLayout());

                        JPanel panel = new JPanel();
                        panel.setLayout(new GridLayout(0, 1));

                        JCheckBox blouseCheckBox = new JCheckBox("Джемпер/свитшот/свитер");
                        JCheckBox shirtCheckBox = new JCheckBox("Водолазка");
                        JCheckBox bblouseCheckBox = new JCheckBox("Кардиган");
                        JCheckBox bshirtCheckBox = new JCheckBox("Худи/толстовка");

                        panel.add(blouseCheckBox);
                        panel.add(shirtCheckBox);
                        panel.add(bblouseCheckBox);
                        panel.add(bshirtCheckBox);

                        blouseFrame.add(panel);
                        blouseFrame.setVisible(true);

                        blouseFrame.addWindowListener(new WindowAdapter() {
                            @Override
                            public void windowClosed(WindowEvent e) {
                                if (blouseCheckBox.isSelected()) {
                                    User_Selection[3] = true;
                                    User_Selection[4] = true;
                                    User_Selection[7] = true;
                                    User_Selection[10] = true;
                                    User_Selection[13] = true;
                                    User_Selection[16] = true;
                                    User_Selection[17] = true;
                                    User_Selection[20] = true;
                                }
                                if (shirtCheckBox.isSelected()) {
                                    User_Selection[15] = true;
                                    User_Selection[28] = true;
                                }
                                if (bblouseCheckBox.isSelected()) {
                                    User_Selection[8] = true;
                                    User_Selection[9] = true;
                                    User_Selection[19] = true;
                                    User_Selection[28] = true;
                                }
                                if (bshirtCheckBox.isSelected()) {
                                    User_Selection[7] = true;
                                    User_Selection[27] = true;
                                }
                                topFrame.setVisible(true);
                            }
                        });

                        blouseFrame.setVisible(true);
                    }
                });

                buttonShirt.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        topFrame.setVisible(false);
                        JFrame ShirtFrame = new JFrame("Майки/топы");
                        ShirtFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        ShirtFrame.setSize(700, 500);
                        ShirtFrame.setLocation(centerX, centerY);
                        ShirtFrame.setLayout(new FlowLayout());

                        JPanel panel = new JPanel();
                        panel.setLayout(new GridLayout(0, 1));

                        JCheckBox MCheckBox = new JCheckBox("Майка");
                        JCheckBox TCheckBox = new JCheckBox("Топ");
                        JCheckBox KCheckBox = new JCheckBox("Корсет");

                        panel.add(MCheckBox);
                        panel.add(TCheckBox);
                        panel.add(KCheckBox);

                        ShirtFrame.add(panel);
                        ShirtFrame.setVisible(true);

                        ShirtFrame.addWindowListener(new WindowAdapter() {
                            @Override
                            public void windowClosed(WindowEvent e) {
                                if (MCheckBox.isSelected()) {
                                    User_Selection[2] = true;
                                    User_Selection[6] = true;
                                    User_Selection[20] = true;
                                    User_Selection[22] = true;
                                    User_Selection[23] = true;
                                }
                                if (TCheckBox.isSelected()) {
                                    User_Selection[0] = true;
                                    User_Selection[10] = true;
                                    User_Selection[23] = true;
                                    User_Selection[24] = true;
                                    User_Selection[25] = true;
                                }
                                if (KCheckBox.isSelected()) {
                                    User_Selection[4] = true;
                                    User_Selection[5] = true;
                                    User_Selection[15] = true;
                                }
                                topFrame.setVisible(true);
                            }
                        });

                        ShirtFrame.setVisible(true);
                    }
                });

                buttonTshirt.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        topFrame.setVisible(false);
                        JFrame SweaterFrame = new JFrame("Футболки");
                        SweaterFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        SweaterFrame.setSize(700, 500);
                        SweaterFrame.setLocation(centerX, centerY);
                        SweaterFrame.setLayout(new FlowLayout());

                        JPanel panel = new JPanel();
                        panel.setLayout(new GridLayout(0, 1));

                        JCheckBox FCheckBox = new JCheckBox("Футболка");

                        panel.add(FCheckBox);

                        SweaterFrame.add(panel);
                        SweaterFrame.setVisible(true);

                        SweaterFrame.addWindowListener(new WindowAdapter() {
                            @Override
                            public void windowClosed(WindowEvent e) {
                                if (FCheckBox.isSelected()) {
                                    User_Selection[11] = true;
                                    User_Selection[26] = true;
                                    User_Selection[27] = true;
                                }
                                topFrame.setVisible(true);
                            }
                        });

                        SweaterFrame.setVisible(true);
                    }
                });

                topFrame.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        frame.setVisible(true);
                    }
                });

                topFrame.setVisible(true);
            }
        });

        JButton buttonBottom = new JButton("Низ");
        buttonBottom.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                JFrame BottomFrame = new JFrame("Низ");
                BottomFrame.setResizable(false);
                BottomFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                BottomFrame.setSize(700, 500);
                BottomFrame.setLocation(centerX, centerY);
                BottomFrame.setLayout(new FlowLayout());

                JButton buttonJeans = new JButton("Джинсы/брюки");
                JButton buttonShorts = new JButton("Шорты");
                JButton buttonSkirts = new JButton("Юбки");


                BottomFrame.add(buttonJeans);
                BottomFrame.add(buttonShorts);
                BottomFrame.add(buttonSkirts);

                buttonJeans.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        BottomFrame.setVisible(false);
                        JFrame JBFrame = new JFrame("Джинсы/брюки");
                        JBFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        JBFrame.setSize(700, 500);
                        JBFrame.setLocation(centerX, centerY);
                        JBFrame.setLayout(new FlowLayout());

                        JPanel panel = new JPanel();
                        panel.setLayout(new GridLayout(0, 1));

                        JCheckBox BCheckBox = new JCheckBox("Брюки");
                        JCheckBox JCheckBox = new JCheckBox("Джинсы");

                        panel.add(BCheckBox);
                        panel.add(JCheckBox);

                        JBFrame.add(panel);
                        JBFrame.setVisible(true);

                        JBFrame.addWindowListener(new WindowAdapter() {
                            @Override
                            public void windowClosed(WindowEvent e) {
                                if (BCheckBox.isSelected()) {
                                    User_Selection[8] = true;
                                    User_Selection[11] = true;
                                    User_Selection[17] = true;
                                    User_Selection[20] = true;
                                    User_Selection[22] = true;
                                    User_Selection[23] = true;
                                    User_Selection[26] = true;
                                }
                                if (JCheckBox.isSelected()) {
                                    User_Selection[2] = true;
                                    User_Selection[7] = true;
                                    User_Selection[27] = true;
                                }
                                BottomFrame.setVisible(true);
                            }
                        });

                        JBFrame.setVisible(true);
                    }
                });

                buttonShorts.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        BottomFrame.setVisible(false);
                        JFrame OuterwearFrame = new JFrame("Шорты");
                        OuterwearFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        OuterwearFrame.setSize(700, 500);
                        OuterwearFrame.setLocation(centerX, centerY);
                        OuterwearFrame.setLayout(new FlowLayout());

                        JPanel panel = new JPanel();
                        panel.setLayout(new GridLayout(0, 1));

                        JCheckBox MCheckBox = new JCheckBox("Мини");
                        JCheckBox UCheckBox = new JCheckBox("Удлинённые");
                        JCheckBox VCheckBox = new JCheckBox("Велосипедки");

                        panel.add(MCheckBox);
                        panel.add(UCheckBox);
                        panel.add(VCheckBox);

                        OuterwearFrame.add(panel);
                        OuterwearFrame.setVisible(true);

                        OuterwearFrame.addWindowListener(new WindowAdapter() {
                            @Override
                            public void windowClosed(WindowEvent e) {
                                if (MCheckBox.isSelected()) {
                                    User_Selection[3] = true;
                                }
                                if (UCheckBox.isSelected()) {
                                    User_Selection[13] = true;
                                }
                                if (VCheckBox.isSelected()) {
                                    User_Selection[0] = true;
                                    User_Selection[3] = true;
                                }
                                BottomFrame.setVisible(true);
                            }
                        });

                        OuterwearFrame.setVisible(true);
                    }
                });

                buttonSkirts.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        BottomFrame.setVisible(false);
                        JFrame SkirtsFrame = new JFrame("Юбки");
                        SkirtsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        SkirtsFrame.setSize(700, 500);
                        SkirtsFrame.setLocation(centerX, centerY);
                        SkirtsFrame.setLayout(new FlowLayout());

                        JPanel panel = new JPanel();
                        panel.setLayout(new GridLayout(0, 1));

                        JCheckBox MaxCheckBox = new JCheckBox("Макси");
                        JCheckBox MidCheckBox = new JCheckBox("Миди");
                        JCheckBox MinCheckBox = new JCheckBox("Мини");

                        panel.add(MaxCheckBox);
                        panel.add(MidCheckBox);
                        panel.add(MinCheckBox);

                        SkirtsFrame.add(panel);
                        SkirtsFrame.setVisible(true);

                        SkirtsFrame.addWindowListener(new WindowAdapter() {
                            @Override
                            public void windowClosed(WindowEvent e) {
                                if (MaxCheckBox.isSelected()) {
                                    User_Selection[10] = true;
                                    User_Selection[16] = true;
                                    User_Selection[18] = true;
                                    User_Selection[25] = true;
                                }
                                if (MidCheckBox.isSelected()) {
                                    User_Selection[4] = true;
                                    User_Selection[5] = true;
                                    User_Selection[13] = true;
                                    User_Selection[28] = true;
                                }
                                if (MinCheckBox.isSelected()) {
                                    User_Selection[6] = true;
                                    User_Selection[15] = true;
                                }
                                BottomFrame.setVisible(true);
                            }
                        });

                        SkirtsFrame.setVisible(true);
                    }
                });

                BottomFrame.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        frame.setVisible(true);
                    }
                });

                BottomFrame.setVisible(true);
            }
        });

        JButton buttonDress = new JButton("Платья/комбинезоны");
        buttonDress.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                JFrame BottomFrame = new JFrame("Платья/комбинезоны");
                BottomFrame.setResizable(false);
                BottomFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                BottomFrame.setSize(700, 500);
                BottomFrame.setLocation(centerX, centerY);
                BottomFrame.setLayout(new FlowLayout());

                JButton buttonKom = new JButton("Комбинезоны");
                JButton buttonCost = new JButton("Костюмы");
                JButton buttonPlat = new JButton("Платья");


                BottomFrame.add(buttonKom);
                BottomFrame.add(buttonCost);
                BottomFrame.add(buttonPlat);

                buttonKom.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        BottomFrame.setVisible(false);
                        JFrame JBFrame = new JFrame("Комбинезоны");
                        JBFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        JBFrame.setSize(700, 500);
                        JBFrame.setLocation(centerX, centerY);
                        JBFrame.setLayout(new FlowLayout());

                        JPanel panel = new JPanel();
                        panel.setLayout(new GridLayout(0, 1));

                        JCheckBox BCheckBox = new JCheckBox("Комбинезон");

                        panel.add(BCheckBox);

                        JBFrame.add(panel);
                        JBFrame.setVisible(true);

                        JBFrame.addWindowListener(new WindowAdapter() {
                            @Override
                            public void windowClosed(WindowEvent e) {
                                if (BCheckBox.isSelected()) {
                                    User_Selection[1] = true;
                                    User_Selection[2] = true;
                                }
                                BottomFrame.setVisible(true);
                            }
                        });

                        JBFrame.setVisible(true);
                    }
                });

                buttonCost.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        BottomFrame.setVisible(false);
                        JFrame OuterwearFrame = new JFrame("Костюмы");
                        OuterwearFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        OuterwearFrame.setSize(700, 500);
                        OuterwearFrame.setLocation(centerX, centerY);
                        OuterwearFrame.setLayout(new FlowLayout());

                        JPanel panel = new JPanel();
                        panel.setLayout(new GridLayout(0, 1));

                        JCheckBox MCheckBox = new JCheckBox("Деловой костюм");
                        JCheckBox UCheckBox = new JCheckBox("Спортивный костюм");

                        panel.add(MCheckBox);
                        panel.add(UCheckBox);

                        OuterwearFrame.add(panel);
                        OuterwearFrame.setVisible(true);

                        OuterwearFrame.addWindowListener(new WindowAdapter() {
                            @Override
                            public void windowClosed(WindowEvent e) {
                                if (MCheckBox.isSelected()) {

                                }
                                if (UCheckBox.isSelected()) {
                                    User_Selection[24] = true;
                                }
                                BottomFrame.setVisible(true);
                            }
                        });

                        OuterwearFrame.setVisible(true);
                    }
                });

                buttonPlat.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        BottomFrame.setVisible(false);
                        JFrame SkirtsFrame = new JFrame("Платья");
                        SkirtsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        SkirtsFrame.setSize(700, 500);
                        SkirtsFrame.setLocation(centerX, centerY);
                        SkirtsFrame.setLayout(new FlowLayout());

                        JPanel panel = new JPanel();
                        panel.setLayout(new GridLayout(0, 1));

                        JCheckBox MaxCheckBox = new JCheckBox("Макси");
                        JCheckBox MidCheckBox = new JCheckBox("Миди");
                        JCheckBox MinCheckBox = new JCheckBox("Мини");

                        panel.add(MaxCheckBox);
                        panel.add(MidCheckBox);
                        panel.add(MinCheckBox);

                        SkirtsFrame.add(panel);
                        SkirtsFrame.setVisible(true);

                        SkirtsFrame.addWindowListener(new WindowAdapter() {
                            @Override
                            public void windowClosed(WindowEvent e) {
                                if (MaxCheckBox.isSelected()) {
                                    User_Selection[9] = true;
                                }
                                if (MidCheckBox.isSelected()) {
                                    User_Selection[19] = true;
                                    User_Selection[29] = true;
                                }
                                if (MinCheckBox.isSelected()) {
                                    User_Selection[14] = true;
                                }

                                BottomFrame.setVisible(true);
                            }
                        });

                        SkirtsFrame.setVisible(true);
                    }
                });

                BottomFrame.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        frame.setVisible(true);
                    }
                });

                BottomFrame.setVisible(true);
            }
        });

        JButton buttonSearch = new JButton("Найти!");

        buttonSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);

                JFrame newFrame = new JFrame("Подобранные типы одежды");
                newFrame.setResizable(false);
                newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                newFrame.setSize(700, 500);
                newFrame.setLocation(centerX, centerY);
                newFrame.setLayout(new FlowLayout());

                // Панель с прокруткой
                JPanel panel = new JPanel(new GridLayout(0, 1, 5, 5)); // 1 столбец, 10px отступы
                JScrollPane scrollPane = new JScrollPane(panel);
                scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                scrollPane.setPreferredSize(new Dimension(700, 500));  // устанавливаем предпочтительный размер

                // Добавление изображений на панель
                for (int i = 0; i < 59; i++) {
                    if (User_Selection[i]) {
                        try {
                            BufferedImage originalImage = ImageIO.read(new File(map.get(i)));
                            int originalWidth = originalImage.getWidth();
                            int originalHeight = originalImage.getHeight();

                            // Подгонка размеров изображения под доступное пространство
                            int availableHeight = scrollPane.getPreferredSize().height;  // используем предпочтительную высоту вместо текущей высоты
                            int scaledWidth = availableHeight * originalWidth / originalHeight;
                            Image scaledImage = originalImage.getScaledInstance(scaledWidth, availableHeight, Image.SCALE_SMOOTH);

                            // Создание метки с подогнанным изображением и добавление на панель
                            JLabel label = new JLabel(new ImageIcon(scaledImage));
                            panel.add(label);
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                }

                panel.revalidate();  // обновляем панель после добавления новых компонентов
                panel.repaint();

                newFrame.add(scrollPane);

                newFrame.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        frame.setVisible(true);
                    }
                });

                newFrame.setVisible(true);
            }

        });

        JButton buttonClear = new JButton("Очистить фильтры");

        buttonClear.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 59; i++)
                    User_Selection[i] = false;
            }

        });

        buttonA.setAlignmentX(JButton.CENTER_ALIGNMENT);
        buttonTop.setAlignmentX(JButton.CENTER_ALIGNMENT);
        buttonBottom.setAlignmentX(JButton.CENTER_ALIGNMENT);
        buttonDress.setAlignmentX(JButton.CENTER_ALIGNMENT);
        buttonSearch.setAlignmentX(JButton.CENTER_ALIGNMENT);
        buttonClear.setAlignmentX(JButton.CENTER_ALIGNMENT);

        Dimension buttonSize = new Dimension(250, 50);

        buttonA.setMaximumSize(buttonSize);
        buttonTop.setMaximumSize(buttonSize);
        buttonBottom.setMaximumSize(buttonSize);
        buttonDress.setMaximumSize(buttonSize);
        buttonSearch.setMaximumSize(buttonSize);
        buttonClear.setMaximumSize(buttonSize);


        panel.add(buttonA);
        panel.add(Box.createVerticalStrut(10));
        panel.add(buttonTop);
        panel.add(Box.createVerticalStrut(10));
        panel.add(buttonBottom);
        panel.add(Box.createVerticalStrut(10));
        panel.add(buttonDress);
        panel.add(Box.createVerticalStrut(10));
        panel.add(buttonClear);
        panel.add(Box.createVerticalStrut(100));
        panel.add(buttonSearch);


        frame.add(panel);
        frame.setVisible(true);
    }
}