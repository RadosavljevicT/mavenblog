package rs.ac.bg.fon.ai.MavenBlog.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import rs.ac.bg.fon.ai.MavenBlog.Post.BlogInf;
import rs.ac.bg.fon.ai.MavenBlog.Post.Citati;
import rs.ac.bg.fon.ai.MavenBlog.Post.Pratioci;
import rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije.SOIzmeniBlogPost;
import rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije.SOObrisiBlogPost;
import rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije.SOPostaviBlogPost;
import rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije.SOPrevedi;
import rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije.SOVratiCitat;
import rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije.SOVratiInformacijeOBlogu;
import rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije.SOVratiPratioce;
import rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije.SOVratiToken;

import javax.swing.JToggleButton;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class MavenBlogGUI extends JFrame {

	private JPanel contentPane;
	private JTextField token1;
	private JTextField token2;
	private JTextField naslov;
	private JTextField infBrojKolikoBlogovaPrati;
	private JTextField infBrojObjava;
	private JTextField infNaslovBloga;
	private JTextField infNazivBloga;
	private JTextField izmenaNaslov;
	private JTextField izmenaPostID;
	private JTextField prevodIzvorniJezik;
	private JTextField prevodStraniJezik;
	private JTextField citatImeAutora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MavenBlogGUI frame = new MavenBlogGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MavenBlogGUI() {
		setTitle("BLOG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 596);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(130, 172, 701, 348);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 255, 204));
		panel_1.setBackground(new Color(230, 230, 250));
		tabbedPane.addTab("Informacije o blogu", null, panel_1, null);
		panel_1.setLayout(null);
		
		infBrojKolikoBlogovaPrati = new JTextField();
		infBrojKolikoBlogovaPrati.setBounds(437, 229, 52, 26);
		panel_1.add(infBrojKolikoBlogovaPrati);
		infBrojKolikoBlogovaPrati.setColumns(10);
		
		JTextArea infOpisBloga = new JTextArea();
		infOpisBloga.setBounds(137, 123, 377, 77);
		panel_1.add(infOpisBloga);
		
		JButton btnInformacijeOBlogu = new JButton("Informacije");
		btnInformacijeOBlogu.setBackground(new Color(255, 255, 204));
		btnInformacijeOBlogu.setForeground(new Color(102, 0, 255));
		btnInformacijeOBlogu.setFont(new Font("Century", Font.PLAIN, 12));
		btnInformacijeOBlogu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInformacijeOBlogu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(token1.getText().length() == 0 ) {
					JOptionPane.showMessageDialog(null, "Niste dobro uneli prvi token!");
					
					return;
					}
					if(token2.getText().length() == 0 ) {
						JOptionPane.showMessageDialog(null, "Niste dobro uneli drugi token!");
						
						return;
						}
					
					
			BlogInf i=	SOVratiInformacijeOBlogu.vratiInformacijeOBlogu(token1.getText(), token2.getText());
			
			infBrojKolikoBlogovaPrati.setText(String.valueOf(i.getFollowings()));
			infNazivBloga.setText(i.getNazivBloga());
			infNaslovBloga.setText(i.getNaslovBloga());
			infOpisBloga.setLineWrap(true);
			infOpisBloga.setText(i.getOpisBloga());
			infBrojObjava.setText(String.valueOf(i.getUkupanBrojObjava()));
			}
		});
		btnInformacijeOBlogu.setBounds(554, 260, 108, 39);
		panel_1.add(btnInformacijeOBlogu);
		
		JLabel lblBrPracenja = new JLabel("Broj pracenja:");
		lblBrPracenja.setForeground(new Color(102, 51, 204));
		lblBrPracenja.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 13));
		lblBrPracenja.setBounds(319, 221, 108, 39);
		panel_1.add(lblBrPracenja);
		
		JLabel lblNazivBloga = new JLabel("Naziv bloga:");
		lblNazivBloga.setForeground(new Color(102, 51, 204));
		lblNazivBloga.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 13));
		lblNazivBloga.setBounds(10, 32, 108, 20);
		panel_1.add(lblNazivBloga);
		
		JLabel lblNaslovBloga_1 = new JLabel("Naslov bloga:");
		lblNaslovBloga_1.setForeground(new Color(102, 51, 204));
		lblNaslovBloga_1.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 13));
		lblNaslovBloga_1.setBounds(10, 81, 108, 20);
		panel_1.add(lblNaslovBloga_1);
		
		JLabel lblOpisBloga = new JLabel("Opis bloga:");
		lblOpisBloga.setForeground(new Color(102, 51, 204));
		lblOpisBloga.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 13));
		lblOpisBloga.setBounds(10, 127, 108, 17);
		panel_1.add(lblOpisBloga);
		
		JLabel lblBrojObjava = new JLabel("Broj objava:");
		lblBrojObjava.setForeground(new Color(102, 51, 204));
		lblBrojObjava.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 13));
		lblBrojObjava.setBounds(137, 221, 93, 39);
		panel_1.add(lblBrojObjava);
		
		infBrojObjava = new JTextField();
		infBrojObjava.setColumns(10);
		infBrojObjava.setBounds(240, 227, 52, 27);
		panel_1.add(infBrojObjava);
		
		infNaslovBloga = new JTextField();
		infNaslovBloga.setColumns(10);
		infNaslovBloga.setBounds(137, 74, 377, 27);
		panel_1.add(infNaslovBloga);
		
		infNazivBloga = new JTextField();
		infNazivBloga.setColumns(10);
		infNazivBloga.setBounds(137, 25, 377, 27);
		panel_1.add(infNazivBloga);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 255));
		tabbedPane.addTab("Postavi objavu", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Unesite naslov:");
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(10, 28, 110, 25);
		panel.add(lblNewLabel);
		
		JLabel lblUnesiteTekst = new JLabel("Unesite tekst:");
		lblUnesiteTekst.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 13));
		lblUnesiteTekst.setBounds(10, 89, 99, 25);
		panel.add(lblUnesiteTekst);
		
		naslov = new JTextField();
		naslov.setBounds(130, 28, 426, 27);
		panel.add(naslov);
		naslov.setColumns(10);
		
		JTextArea tekst = new JTextArea();
		tekst.setBounds(130, 90, 426, 144);
		panel.add(tekst);
		
		JButton btnNovaObjava = new JButton("Postavi ");
		btnNovaObjava.setBackground(new Color(255, 255, 204));
		btnNovaObjava.setForeground(new Color(102, 0, 255));
		btnNovaObjava.setFont(new Font("Century", Font.PLAIN, 12));
		btnNovaObjava.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(token1.getText().length() == 0 ) {
				JOptionPane.showMessageDialog(null, "Niste dobro uneli prvi token!");
				
				return;
				}
				if(token2.getText().length() == 0 ) {
					JOptionPane.showMessageDialog(null, "Niste dobro uneli drugi token!");
					
					return;
					}
				
				if(tekst.getText().length() == 0 ) {
					JOptionPane.showMessageDialog(null, "Niste dobro uneli tekst!");
					
					return;
					}
				if(naslov.getText().length() == 0 ) {
					JOptionPane.showMessageDialog(null, "Niste dobro uneli naslov!");
					
					return;
					}
				try {
					SOPostaviBlogPost.postaviBlogPost(token1.getText(), token2.getText(), tekst.getText(), naslov.getText());
					JOptionPane.showMessageDialog(null, "Uspesno ste objavili novu objavu!");
					
				} catch (InstantiationException e1) {
					
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNovaObjava.setBounds(548, 254, 99, 25);
		panel.add(btnNovaObjava);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(230, 230, 250));
		tabbedPane.addTab("Izmeni/Obrisi objavu", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNoviNaslov = new JLabel("Novi naslov:");
		lblNoviNaslov.setForeground(new Color(102, 51, 204));
		lblNoviNaslov.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 13));
		lblNoviNaslov.setBounds(42, 23, 90, 22);
		panel_2.add(lblNoviNaslov);
		
		JLabel lblNoviTekst = new JLabel("Novi tekst:");
		lblNoviTekst.setForeground(new Color(102, 51, 204));
		lblNoviTekst.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 13));
		lblNoviTekst.setBounds(42, 90, 79, 22);
		panel_2.add(lblNoviTekst);
		
		JLabel lblPostIDIzmena = new JLabel("Post ID:");
		lblPostIDIzmena.setForeground(new Color(102, 51, 204));
		lblPostIDIzmena.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 13));
		lblPostIDIzmena.setBounds(42, 212, 67, 13);
		panel_2.add(lblPostIDIzmena);
		
		izmenaNaslov = new JTextField();
		izmenaNaslov.setBounds(131, 28, 338, 29);
		panel_2.add(izmenaNaslov);
		izmenaNaslov.setColumns(10);
		
		izmenaPostID = new JTextField();
		izmenaPostID.setColumns(10);
		izmenaPostID.setBounds(131, 205, 338, 29);
		panel_2.add(izmenaPostID);
		
		JTextArea izmenaTekst = new JTextArea();
		izmenaTekst.setBounds(131, 67, 338, 111);
		panel_2.add(izmenaTekst);
		
		JButton btnIzmeniObjavu = new JButton("Izmeni");
		btnIzmeniObjavu.setBackground(new Color(255, 255, 204));
		btnIzmeniObjavu.setForeground(new Color(102, 0, 255));
		btnIzmeniObjavu.setFont(new Font("Century", Font.PLAIN, 12));
		btnIzmeniObjavu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(token1.getText().length() == 0 ) {
					JOptionPane.showMessageDialog(null, "Niste dobro uneli prvi token!");
					
					return;
					}
					if(token2.getText().length() == 0 ) {
						JOptionPane.showMessageDialog(null, "Niste dobro uneli drugi token!");
						
						return;
						}
					
					if(Long.parseLong(izmenaPostID.getText())==0) {
                     JOptionPane.showMessageDialog(null, "Niste dobro uneli post id!");
						
						return;
						
					}
					
					if(izmenaTekst.getText().length() == 0 ) {
						JOptionPane.showMessageDialog(null, "Niste dobro uneli tekst!");
						
						return;
						}
					if(izmenaNaslov.getText().length() == 0 ) {
						JOptionPane.showMessageDialog(null, "Niste dobro uneli naslov!");
						
						return;
						}
					
					
					SOIzmeniBlogPost.izmeniBlogPost(token1.getText(), token2.getText(), izmenaNaslov.getText(), izmenaTekst.getText(), Long.parseLong(izmenaPostID.getText()));
					JOptionPane.showMessageDialog(null, "Uspesno ste izmenili objavu!");
			}
		});
		btnIzmeniObjavu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIzmeniObjavu.setBounds(540, 26, 90, 29);
		panel_2.add(btnIzmeniObjavu);
		
		JButton btnObrisiObjavu = new JButton("Obrisi");
		btnObrisiObjavu.setBackground(new Color(255, 255, 204));
		btnObrisiObjavu.setForeground(new Color(102, 0, 255));
		btnObrisiObjavu.setFont(new Font("Century", Font.PLAIN, 12));
		btnObrisiObjavu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnObrisiObjavu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(token1.getText().length() == 0 ) {
					JOptionPane.showMessageDialog(null, "Niste dobro uneli prvi token!");
					
					return;
					}
					if(token2.getText().length() == 0 ) {
						JOptionPane.showMessageDialog(null, "Niste dobro uneli drugi token!");
						
						return;
						}
					
					if(Long.parseLong(izmenaPostID.getText())==0) {
                     JOptionPane.showMessageDialog(null, "Niste dobro uneli post id!");
						
						return;
						
					}
					SOObrisiBlogPost.obrisiBlogPost(token1.getText(), token2.getText(), Long.parseLong(izmenaPostID.getText()));
					JOptionPane.showMessageDialog(null, "Uspesno ste obrisali objavu!");
			}
		});
		btnObrisiObjavu.setBounds(540, 236, 90, 29);
		panel_2.add(btnObrisiObjavu);
		
		JLabel lblObrisiObjavu = new JLabel("<html>Ako zelite da obrisete objavu, <br/>samo popunite \"Post ID\" polje.</html>\r\n");
		lblObrisiObjavu.setForeground(new Color(102, 0, 153));
		lblObrisiObjavu.setFont(new Font("Century Schoolbook", Font.PLAIN, 11));
		lblObrisiObjavu.setBounds(503, 146, 183, 63);
		panel_2.add(lblObrisiObjavu);
		
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(204, 204, 255));
		tabbedPane.addTab("Pratioci", null, panel_3, null);
		panel_3.setLayout(null);
		
		JTextArea listaPratioca = new JTextArea();
		listaPratioca.setBounds(51, 41, 368, 188);
		panel_3.add(listaPratioca);
		
		JButton btnPratioci = new JButton("Vidi pratioce");
		btnPratioci.setBackground(new Color(255, 255, 204));
		btnPratioci.setForeground(new Color(102, 0, 255));
		btnPratioci.setFont(new Font("Century", Font.PLAIN, 12));
		btnPratioci.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(token1.getText().length() == 0 ) {
					JOptionPane.showMessageDialog(null, "Niste dobro uneli prvi token!");
					
					return;
					}
					if(token2.getText().length() == 0 ) {
						JOptionPane.showMessageDialog(null, "Niste dobro uneli drugi token!");
						
						return;
						}
					
				List<String> p =SOVratiPratioce.vratiPratioce(token1.getText(), token2.getText());
				String ispis;
				for (int i=0; i< p.size(); i++) {
					ispis = p.get(i).toString();
					
				    listaPratioca.setLineWrap(true);
					listaPratioca.setText(ispis);
			}
			
			}});
		btnPratioci.setBounds(479, 98, 142, 21);
		panel_3.add(btnPratioci);
		
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(230, 230, 250));
		tabbedPane.addTab("Prevedi tekst", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblIzvorniJezik = new JLabel("<html>Unesite izvorni jezik: <br/> en - engleski <br/> de - nemacki <br/> it - italijanski <br/> ru - ruski </html>");
		lblIzvorniJezik.setForeground(new Color(102, 51, 204));
		lblIzvorniJezik.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 12));
		lblIzvorniJezik.setBounds(34, 10, 147, 87);
		panel_4.add(lblIzvorniJezik);
		
		JLabel lblStraniJezik = new JLabel("<html>Unesite strani jezik: <br/> en - engleski <br/> de - nemacki <br/> it - italijanski <br/> ru - ruski </html>");
		lblStraniJezik.setForeground(new Color(102, 51, 204));
		lblStraniJezik.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 12));
		lblStraniJezik.setBounds(367, 10, 147, 87);
		panel_4.add(lblStraniJezik);
		
		JLabel lblTekstZaPrevodjenje = new JLabel("Unesite tekst za prevodjenje:");
		lblTekstZaPrevodjenje.setForeground(new Color(102, 51, 204));
		lblTekstZaPrevodjenje.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 12));
		lblTekstZaPrevodjenje.setBounds(50, 107, 184, 30);
		panel_4.add(lblTekstZaPrevodjenje);
		
		prevodIzvorniJezik = new JTextField();
		prevodIzvorniJezik.setBounds(175, 16, 96, 19);
		panel_4.add(prevodIzvorniJezik);
		prevodIzvorniJezik.setColumns(10);
		
		prevodStraniJezik = new JTextField();
		prevodStraniJezik.setBounds(524, 16, 96, 19);
		panel_4.add(prevodStraniJezik);
		prevodStraniJezik.setColumns(10);
		
		JTextArea prevodPrevedeniTekst = new JTextArea();
		prevodPrevedeniTekst.setBounds(363, 147, 284, 114);
		panel_4.add(prevodPrevedeniTekst);
		
		JTextArea prevodOriginalTekst = new JTextArea();
		prevodOriginalTekst.setBounds(34, 147, 260, 114);
		panel_4.add(prevodOriginalTekst);
		
		JButton btnPrevedi = new JButton("Prevedi");
		btnPrevedi.setBackground(new Color(255, 255, 204));
		btnPrevedi.setForeground(new Color(102, 0, 255));
		btnPrevedi.setFont(new Font("Century", Font.PLAIN, 12));
		btnPrevedi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
					if(prevodStraniJezik.getText().length() == 0 ) {
						JOptionPane.showMessageDialog(null, "Niste dobro uneli strani jezik!");
						
						return;
						}
						if(prevodOriginalTekst.getText().length() == 0 ) {
							JOptionPane.showMessageDialog(null, "Niste dobro uneli tekst za prevodjenje!");
							
							return;
							}
						
						try {
							prevodPrevedeniTekst.setLineWrap(true);
							prevodPrevedeniTekst.setText(SOPrevedi.prevedi(prevodOriginalTekst.getText(), prevodIzvorniJezik.getText(), prevodStraniJezik.getText()));
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			}
		});
		btnPrevedi.setBounds(50, 270, 121, 30);
		panel_4.add(btnPrevedi);
		
		
		
		
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(204, 204, 255));
		tabbedPane.addTab("Citat", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblCitatImeAutora = new JLabel("Ime autora:");
		lblCitatImeAutora.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 13));
		lblCitatImeAutora.setBounds(26, 28, 89, 22);
		panel_5.add(lblCitatImeAutora);
		
		JLabel lblCitatTekst = new JLabel("Citat:");
		lblCitatTekst.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 13));
		lblCitatTekst.setBounds(26, 74, 55, 22);
		panel_5.add(lblCitatTekst);
		
		citatImeAutora = new JTextField();
		citatImeAutora.setBounds(125, 31, 258, 19);
		panel_5.add(citatImeAutora);
		citatImeAutora.setColumns(10);
		
		JTextArea citatTekst = new JTextArea();
		citatTekst.setBounds(125, 74, 258, 116);
		panel_5.add(citatTekst);
		
		JButton btnTraziCitat = new JButton("Trazi citat");
		btnTraziCitat.setBackground(new Color(255, 255, 204));
		btnTraziCitat.setForeground(new Color(102, 0, 255));
		btnTraziCitat.setFont(new Font("Century", Font.PLAIN, 12));
		btnTraziCitat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Citati c = SOVratiCitat.vratiCitat();
					
					citatImeAutora.setText(c.getImeAutora());
					citatTekst.setRows(5);
					citatTekst.setLineWrap(true);
					citatTekst.setText(c.getCitat());
				
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (Throwable e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnTraziCitat.setBounds(496, 112, 112, 21);
		panel_5.add(btnTraziCitat);
		
		JLabel lblNewLabel_1 = new JLabel("Unesite 1. token:");
		lblNewLabel_1.setForeground(new Color(102, 51, 204));
		lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.BOLD, 13));
		lblNewLabel_1.setBounds(20, 22, 151, 25);
		contentPane.add(lblNewLabel_1);
		
		token1 = new JTextField();
		token1.setBounds(181, 23, 595, 25);
		contentPane.add(token1);
		token1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Unesite 2. token:");
		lblNewLabel_1_1.setForeground(new Color(102, 51, 204));
		lblNewLabel_1_1.setFont(new Font("Century Schoolbook", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(20, 63, 119, 25);
		contentPane.add(lblNewLabel_1_1);
		
		token2 = new JTextField();
		token2.setColumns(10);
		token2.setBounds(181, 60, 595, 25);
		contentPane.add(token2);
	}
}
