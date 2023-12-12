/* NAME: Janan Jahed
 * DATE: 16th of September 
 * PURPOSE: SECOND FRAME 
 */

//importing libraries and modules 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;  
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

//Inheritence - Class WB extends the Main class 
public class WB extends Main{
	public JFrame secondbox;
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB window = new WB();
					window.secondbox.setVisible(true);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
	}

	public WB() {
		initialize();
	}
	
	private void initialize() {
		//importing calendar to get date and time for files - https://www.tabnine.com/code/java/methods/java.util.Calendar/toString
		Calendar calendar = Calendar.getInstance();
		String Date=calendar.getTime().toString();
		//Initializing Jframes
		secondbox = new JFrame();
		secondbox.setTitle("Student Organiser");
		secondbox.setBounds(200, 100, 600, 400);
		// Creating 4 linked lists for the 4 advisors 
		LinkedList<Student> jamesList = new LinkedList <Student>();
		LinkedList<Student> kerriganList = new LinkedList <Student>();
		LinkedList<Student> shayList = new LinkedList <Student>();
		LinkedList<Student> kumarList = new LinkedList <Student>();
		//Creating linked lists that can store each component of the object
		LinkedList<String> A = new LinkedList<>();
		LinkedList<String> B = new LinkedList<>();
		LinkedList<String> C = new LinkedList<>();
		LinkedList<String> D = new LinkedList<>();
		LinkedList<String> E = new LinkedList<>();
		LinkedList<String> F = new LinkedList<>();
		LinkedList<String> G = new LinkedList<>();
		LinkedList<String> H = new LinkedList<>();
		//creating a linked list that hold all the students 
		LinkedList<Student> allStudents = new LinkedList<>();
		
		//Try and catch - Try defines a block of statements that may throw an exception. When a specific type of exception occurs, a catch block catches the exception
		 try{
		    	//Initializing the file reader and buffer reader that take information from .txt file
		        FileReader fr = new FileReader("Data.txt");
		        BufferedReader br = new BufferedReader(fr);

		        if (br.ready()){
		          String line = br.readLine();
		          
		          while (line != null){ // while not EOF (end of file)
		            String[] data = line.split(","); //create String array from row
		            //Adding the members of the data array to linked Lists
		            A.add(data[0]);
		            B.add(data[1]);
		            C.add(data[2]);
		            D.add(data[3]);
		            E.add(data[4]);
		            F.add(data[5]);
		            G.add(data[6]);
		            H.add(data[7]);
		            // Next line code
		            line = br.readLine();

		          }

		        }

		        br.close();

		      }

		      catch (Exception e){
		        System.out.println();
		      }
		 
		 	// Converting from object array to string array
		 	String[] z1 =Arrays.copyOf(A.toArray(), A.toArray().length, String[].class);
			String[] z2 =Arrays.copyOf(B.toArray(), B.toArray().length, String[].class);
			String[] z3 =Arrays.copyOf(C.toArray(), C.toArray().length, String[].class);
			String[] z4 =Arrays.copyOf(D.toArray(), D.toArray().length, String[].class);
			String[] z5 =Arrays.copyOf(E.toArray(), E.toArray().length, String[].class);
			String[] z6 =Arrays.copyOf(F.toArray(), F.toArray().length, String[].class);
			String[] z7 =Arrays.copyOf(G.toArray(), G.toArray().length, String[].class);
			String[] z8 =Arrays.copyOf(H.toArray(), H.toArray().length, String[].class);
			
	
		//Looping through object array B 
		for(int i = 0 ;i < B.toArray().length;i++) {
			//Object studInfo holds different indexes of the .txt file
			Student studInfo = new Student(z1[i], z2[i], z3[i], z4[i], z5[i], Integer.parseInt(z6[i]), Integer.parseInt(z7[i]), Integer.parseInt(z8[i]));
			//adding studInfo to the linked list 
			allStudents.add(studInfo);
		}
			
				//Creating JPanels
				JPanel show = new JPanel();
				show.setBounds(0,0,444,278);
				secondbox.getContentPane().add(show);
				show.setLayout(null);
				JPanel ask = new JPanel();
				ask.setBounds(0, 0, 241, 372);
				show.add(ask);
				ask.setBackground(new Color(128, 0, 0));
				ask.setLayout(null);
				
				
				//Combo box reads and shows the name (A) of the students 
				JComboBox CB = new JComboBox(A.toArray(z1));
				CB.setFont(new Font("Georgia", Font.PLAIN, 11));
				CB.setBackground(new Color(255, 255, 224));
				CB.setBounds(47,227,163,27);
				ask.add(CB);
				CB.setToolTipText("Select student's name");
				
				//Creating a save button 
				JButton save = new JButton ("Save");
				save.setFont(new Font("Georgia", Font.BOLD, 11));
				save.setBorder(UIManager.getBorder("Button.border"));
				save.setBackground(new Color(255, 215, 0));
				save.setBounds(87,266,85,29);
				ask.add(save);
				ask.setBackground(Color.WHITE);
				
					//Creating a back button 
					JButton back = new JButton ("back");
					back.setBackground(new Color(255, 215, 0));
					back.setBounds(73, 296, 117, 32);
					ask.add(back);
					
					JLabel lblNewLabel_1 = new JLabel("New label");
					lblNewLabel_1.setIcon(new ImageIcon("images.jpeg"));
					lblNewLabel_1.setBounds(18, 60, 206, 155);
					ask.add(lblNewLabel_1);
					
					JLabel Dat = new JLabel(Date);
					Dat.setBounds(29, 13, 224, 16);
					ask.add(Dat);
					Dat.setForeground(Color.BLACK);
					
					JButton btnNewButton = new JButton("New button");
					btnNewButton.setBounds(0, 0, 117, 29);
					show.add(btnNewButton);
					
					JPanel main = new JPanel();
					main.setBounds(242, 0, 352, 374);
					show.add(main);
					main.setBackground(new Color(25, 25, 112));
					main.setLayout(null);
					
					//Creating the buttons with teacher names 
					JButton James = new JButton ("Mr. James");
					James.setForeground(new Color(255, 215, 0));
					James.setBackground(new Color(255, 215, 0));
					James.setFont(new Font("Georgia", Font.BOLD, 11));
					James.setBounds(120,170,117,29);
					main.add(James);
					
					JButton Kumar = new JButton ("Mr. Kumar");
					Kumar.setForeground(new Color(255, 215, 0));
					Kumar.setBackground(Color.RED);
					Kumar.setFont(new Font("Georgia", Font.BOLD, 11));
					Kumar.setBounds(120,129,117,29);
					main.add(Kumar);
					
					
					JButton Kerrigan = new JButton ("Mr. Kerrigan");
					Kerrigan.setForeground(new Color(255, 215, 0));
					Kerrigan.setBackground(new Color(255, 215, 0));
					Kerrigan.setFont(new Font("Georgia", Font.BOLD, 11));
					Kerrigan.setBounds (120,248,117,29);
					main.add(Kerrigan);
					

					
					JButton Shay = new JButton ("Mr. Shay");
					Shay.setForeground(new Color(255, 215, 0));
					Shay.setBackground(new Color(255, 215, 0));
					Shay.setFont(new Font("Georgia", Font.BOLD, 11));
					Shay.setBounds (120,211,117,29);
					main.add(Shay);
					
					//Creating a student information button which opens the Student information JFrame and closes the rest
					JButton student = new JButton("Student information");
					student.setBackground(new Color(255, 215, 0));
					student.setForeground(Color.BLACK);
					
					//Action listener for when the student info button is clicked
					student.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							//When the button is clicked all frames are closed except for student information 
							secondbox.setVisible(false);
							setVisible(false);
							Info window = new Info();
							window.frame.setVisible(true);
							secondbox.setVisible(false);
							setVisible(false);
						}
					});
					
					student.setBounds(189, 22, 157, 23);
					main.add(student);
					
					//Jlabel to tell the advisor to click on their name once they are done 
					JLabel lblNewLabel = new JLabel("Please select your name ");
					lblNewLabel.setForeground(new Color(255, 255, 255));
					lblNewLabel.setBounds(109, 89, 237, 16);
					main.add(lblNewLabel);
					
					//Creating a randomizer button which randomizes the students 
					JButton randomiser = new JButton("Randomiser");
					
					randomiser.setForeground(new Color(255, 153, 51));
					randomiser.setBounds(120, 305, 117, 29);
					main.add(randomiser);
			
			//Action listener for Mr James' button 
			James.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					//Selected  is equal to a name that is selected from the combo box
					String selected = (String) CB.getSelectedItem();
					// if the combo box is empty 
					if(selected.equals("")) {
						//Show the following message 
						JOptionPane.showMessageDialog(null, "You have logged in all the students!");
					}
					//else convert james linked list to array list and compare the length to 15, the limit, if it's less than 15 then
					else {
					if(jamesList.toArray().length<15) {
					//loop through the ' allstudent'  linked list 
					for(int i =0; i < allStudents.toArray().length;i++) {
							// save the student name in jamesList and remove the name from the combo box
							if(selected.equals(((Student) allStudents.toArray()[i]).StudName()))
							jamesList.add((Student) allStudents.toArray()[i]);
							CB.removeItem(selected);
						}
						
					}
					//else display a message saying the classroom is full 
					else {
						JOptionPane.showMessageDialog(null, "Mr. James' classroom is full. Please try another class");
					}
					}
				}
			
				
			});
			
			//same method as james.addAction listener but for shayList
			Shay.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				
					
					String selected=(String) CB.getSelectedItem();
					if(selected.equals("")) {
						JOptionPane.showMessageDialog(null, "You have logged in all the students!");
					}
					else {
						if(shayList.toArray().length<15) {
							for(int i =0; i<allStudents.toArray().length;i++) {
							
									if(selected.equals(((Student) allStudents.toArray()[i]).StudName()))
									shayList.add((Student) allStudents.toArray()[i]);
									CB.removeItem(selected);
								}
								
							}
							else {
								JOptionPane.showMessageDialog(null, "Mr. Shay's classroom is full. Please try another class");
							}
					}
					
				}
				
				
			});
			//same method as james.addAction listener but for KerriganList
			Kerrigan.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					
					String selected=(String) CB.getSelectedItem();
					
					if(selected.equals("")) {
						JOptionPane.showMessageDialog(null, "You have logged in all the students!");
					}
					else {
					if(kerriganList.toArray().length<15) {
					for(int i =0; i<allStudents.toArray().length;i++) {
							if(selected.equals(((Student) allStudents.toArray()[i]).StudName()))
							kerriganList.add((Student) allStudents.toArray()[i]);
							CB.removeItem(selected);
						}
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Mr. Kerrigan's classroom is full. Please try another class");
					}
				   }
				}
				
			});
			
			//same method as james.addAction listener but for Kumar list 
			Kumar.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					
					String selected = (String) CB.getSelectedItem();
					
					if(selected.equals("")) {
				
						JOptionPane.showMessageDialog(null, "You have logged in all the students!");
					}
					else {
					if(kumarList.toArray().length<15) {
					for(int i =0; i<allStudents.toArray().length;i++) {
						
							if(selected.equals(((Student) allStudents.toArray()[i]).StudName()))
							kumarList.add((Student) allStudents.toArray()[i]);
							CB.removeItem(selected);
						}
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Mr. Kumar's classroom is full. Please try another class");
					}
				  }	
				}
			});
			
			//Randomizing students and storing it in a text file 
			randomiser.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
			    	//Initializes FileWriter import and BufferWriter and PrintWriter
			    	try(FileWriter fw = new FileWriter("Current.txt", true);
			    	  	    BufferedWriter bw = new BufferedWriter(fw);
			    	  	    PrintWriter out = new PrintWriter(bw))
			    	  	{
			    		//PrintWriter creates new .txt file called Current.txt
			    	  	PrintWriter writer = new PrintWriter("Current.txt");
			    	  	writer.print("");
			    	  	writer.close();

			    	  	//Loops through all students and will print the names until all students have been added
						for(int i = 0; i < allStudents.toArray().length ; i++) {
							//new random object using the random() method 
							Random rand = new Random();
							//Initializing the maximum value of randomized number 
							int max = 4;
							int randNum = rand.nextInt(max)+1;
							//object selected that holds in the index of the array list
							Object selected = allStudents.toArray()[i];
							
						
							//if the generated random number = 1 then add the name of a student to jamesList
							if(randNum == 1) {
								jamesList.add(((Student) selected));
							
							}

							//if the generated random number = 2 then add the name of a student to kumarList
							else if(randNum == 2) {
								kumarList.add((Student) selected);
							
							}
							
							//if the generated random number = 3 then add the name of a student to kerriganList
							else if(randNum == 3) {
								kerriganList.add((Student) selected);
							
							}
							//if the generated random number = 4 then add the name of a student to shayList
							else if (randNum == 4) {
								shayList.add((Student) selected);
						
							}
						
						}
						
			    	  	} 

			    		catch (Exception e1) {

			    		}
				}
			});
			
			//The action listener for the back button 
			back.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//The back button - will close the current frame and opens the previous one
					Main Main=new Main();
					Main.setVisible(true);
					secondbox.setVisible(false);
					setVisible(false);
					
					
				}
			});
		
			//The action listener for the save button 
			save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//save button - once it's clicked will display a message 
				JOptionPane.showMessageDialog(null, "You information has been saved to the .txt file");
					//Frame are closed
					main.setVisible(false);
					ask.setVisible(false);
					show.setVisible(false);
				
		    //Initializes FileWriter import and BufferWriter and PrintWriter
			try(FileWriter fw = new FileWriter(Date, true);
	    	  	    BufferedWriter bw = new BufferedWriter(fw);
	    	  	    PrintWriter out = new PrintWriter(bw)){
				
	    		//PrintWriter creates new .txt file called Current.txt
	    	  	PrintWriter writer = new PrintWriter(Date);
	    	  	writer.print("");
	    	  	writer.close();

		    	  	out.println();
					out.println(" Mr Shay's class: ");
					out.println();
					Object[] a = shayList.toArray();
					for(int i = 0; i < a.length ; i++) {
						for (int j = i + 1; j < a.length; j++) {   
				            // to compare one string with other strings
							if ((((Student) a[i]).StudName()).compareTo(((Student) a[j]).StudName()) > 0) {
								Object temp;
				                // swapping
				                temp = a[i];
				                a[i] = a[j];
				                a[j] = temp;
				            }
				        }
					}
					//Outputting the name 
					for (int i = 0; i < a.length; i++) {
						out.println(((Student) a[i]).StudName());
					}
					
					//Same process as Mr.Shay's class
					out.println();
					out.println(" Kerrigan's class: ");
					out.println();
					Object[] b = kerriganList.toArray();
					for(int i = 0; i < b.length ; i++) {
						for (int j = i + 1; j < b.length; j++) {   
				            // to compare one string with other strings
							if ((((Student) b[i]).StudName()).compareTo(((Student) b[j]).StudName()) > 0) {
								Object temp;
				                // swapping
				                temp = b[i];
				                b[i] = b[j];
				                b[j] = temp;
				             }
				         }
					}
					
					for (int i = 0; i < b.length; i++) {
						out.println(((Student) b[i]).StudName());
					}
					
					//Same process as Mr.Shay's class 
					out.println();
					out.println(" Mr Kumar's class: ");
					out.println();
					Object[] c=kumarList.toArray();
					
					for(int i = 0; i < c.length ; i++) {
						for (int j = i + 1; j < c.length; j++) {   
				                // to compare one string with other strings
				               if ((((Student) c[i]).StudName()).compareTo(((Student) c[j]).StudName()) > 0) {
				                	Object temp;
				                    // swapping
				                    temp = a[i];
				                    c[i] = c[j];
				                    c[j] = temp;
				                }
				            }
					}
					
					for (int i = 0; i < c.length; i++) {
						out.println(((Student) c[i]).StudName());
					}
					
					out.println();
					out.println(" Mr James' class: ");
					out.println();
					Object[] d=jamesList.toArray();
					for(int i = 0; i < d.length ; i++) {
						for (int j = i + 1; j < d.length; j++) {   
				                // to compare one string with other strings
				               if ((((Student) d[i]).StudName()).compareTo(((Student) d[j]).StudName()) > 0) {
				                	Object temp;
				                    // swapping
				                    temp = d[i];
				                    d[i] = d[j];
				                    d[j] = temp;
				                }
				            }
					}
					
					for (int i = 0; i < d.length; i++) {
						out.println(((Student) d[i]).StudName());
					}
		    	  	}

			
			catch (IOException e1) {
				
			}
			
			//Closes the program
			System.exit(0);
			}
			
		});
		
		
		//
		save.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			main.setVisible(false);
			show.setVisible(false);
			show.setVisible(true);
			

			
		}
	});
	}
}
