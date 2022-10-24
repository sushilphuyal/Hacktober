import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class IngCollege extends JFrame
{   
     JButton btnAcademic,btnNonAcademic; 
     JPanel panel_Courses;//panelAcademic
     JLabel lbl_Academic,lbl_NonAcademic,lbl_CourseID,lbl_CourseName,lbl_Duration,lbl_Lecturer_Name,lbl_Level,lbl_Credit,lbl_StartDate,lbl_CompletionDate,lbl_NumberOfAssessment,lbl_Course_Leader;
    JTextField txt_CourseID,txt_CourseName,txt_Duration,txt_Lecturer_Name,txt_Level,txt_Credit,txt_NumberOfAssessment,txt_Course_Leader;
   JButton btnDisplay,btnRegister,btnExit,btnAdd,btnClear,btnRemove;
     JTextField txt_StartDate,txt_CompletionDate,txt_ExamDate,txt_preRequisite,txt_InstructorName;
     JLabel lbl_ExamDate,lbl_preRequisite,lbl_InstructorName;
   Font flbl1,ff,ftxt;
    public IngCollege()
    {   
        super("Course Registration");
        
        
        panel_Courses = new JPanel();
        panel_Courses.setLayout(null);
        panel_Courses.setBackground(Color.YELLOW);
        panel_Courses.setSize(765,485);
        
        
        
        btnAcademic = new JButton("Academic Course");
        btnAcademic.setBounds(170,50,180,25);
        btnAcademic.setBackground(Color.YELLOW);
        //btnAcademic.setBorder(null);
                btnAcademic.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              lbl_NonAcademic.setVisible(false);
             lbl_Academic.setVisible(true);  
                
             lbl_Level.setVisible(true);
             lbl_Credit.setVisible(true);
             lbl_Lecturer_Name.setVisible(true);
             lbl_NumberOfAssessment.setVisible(true);
             
             txt_Level.setVisible(true);
             txt_Credit.setVisible(true);
             txt_Lecturer_Name.setVisible(true);
             txt_NumberOfAssessment.setVisible(true);
                
             btnRemove.setVisible(false);   
             lbl_preRequisite.setVisible(false);
             lbl_ExamDate.setVisible(false);
             lbl_InstructorName.setVisible(false);
             
             txt_preRequisite.setVisible(false);
             txt_ExamDate.setVisible(false);
             txt_InstructorName.setVisible(false);
            }
        });


        btnNonAcademic = new JButton("Non Academic Course");//jbtn_2.setBounds(150,320,56,20);
        btnNonAcademic.setBounds(370,50,180,25);
        btnNonAcademic.setBackground(Color.YELLOW);
        //btnNonAcademic.setBorder(null);
        btnNonAcademic.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              lbl_NonAcademic.setVisible(true);
             lbl_Academic.setVisible(false);  
                
             lbl_Level.setVisible(false);
             lbl_Credit.setVisible(false);
             lbl_Lecturer_Name.setVisible(false);
             lbl_NumberOfAssessment.setVisible(false);
             
             txt_Level.setVisible(false);
             txt_Credit.setVisible(false);
             txt_Lecturer_Name.setVisible(false);
             txt_NumberOfAssessment.setVisible(false);
                
             btnRemove.setVisible(true);   
             lbl_preRequisite.setVisible(true);
             lbl_ExamDate.setVisible(true);
             lbl_InstructorName.setVisible(true);
             
             txt_preRequisite.setVisible(true);
             txt_ExamDate.setVisible(true);
             txt_InstructorName.setVisible(true);
            }
        });
        
        btnDisplay = new JButton("Display");
        btnDisplay.setBounds(170,380,150,25);
        
        btnRemove = new JButton("Remove");
        btnRemove.setBounds(360,200,150,25);
        btnRemove.setBackground(Color.RED);
        btnRemove.setForeground(Color.WHITE);
        btnRemove.setVisible(false);
        
        
        btnRegister = new JButton("Register");
        btnRegister.setBounds(550,340,150,25);
        
        
        btnAdd = new JButton("Add");
        btnAdd.setBounds(550,200,150,25);
        
        btnExit = new JButton("Exit");
        btnExit.setBounds(550,380,150,25);
        btnExit.setBackground(Color.RED);
        btnExit.setForeground(Color.WHITE);
        
        btnClear = new JButton("Clear");
        btnClear.setBounds(360,380,150,25);
        btnClear.setBackground(Color.RED);
        btnClear.setForeground(Color.WHITE);
        
        flbl1 = new Font("Arial",Font.BOLD,23);
        ff = new Font("Arial",Font.BOLD,14);
        ftxt = new Font("Arial",Font.PLAIN,14);
        
        
        lbl_Academic = new JLabel("Academic Course");
        lbl_Academic.setBounds(260,10,200,30);
        lbl_Academic.setFont(flbl1);
        
         lbl_NonAcademic = new JLabel("Non Academic Course");
        lbl_NonAcademic.setBounds(260,10,300,30);
        lbl_NonAcademic.setFont(flbl1);
        lbl_NonAcademic.setVisible(false);
        
        lbl_CourseID = new JLabel("Course ID : ");
        lbl_CourseID.setBounds(40,100,90,20);
        lbl_CourseID.setFont(ff);
        
        lbl_CourseName = new JLabel("Course Name : ");
        lbl_CourseName.setBounds(360,100,130,20);
        lbl_CourseName.setFont(ff);
        
        lbl_Duration = new JLabel("Duration : ");
        lbl_Duration.setBounds(41,130,90,20);
        lbl_Duration.setFont(ff);
        
         lbl_preRequisite = new JLabel("preRequisite : ");
        lbl_preRequisite.setBounds(360,130,130,20);
        lbl_preRequisite.setFont(ff);
        lbl_preRequisite.setVisible(false);
        
        
        lbl_ExamDate = new JLabel("ExamDate : ");
        lbl_ExamDate.setBounds(40,310,100,20);
        lbl_ExamDate.setFont(ff);
        lbl_ExamDate.setVisible(false);

        
         lbl_InstructorName = new JLabel("Lecturuer Name : ");
        lbl_InstructorName.setBounds(40,280,130,20);//40,180,130,20
        lbl_InstructorName.setFont(ff);
         lbl_InstructorName.setVisible(false);
        
        
        lbl_Lecturer_Name = new JLabel("Lecturuer Name : ");
        lbl_Lecturer_Name.setBounds(40,280,130,20);//40,180,130,20
        lbl_Lecturer_Name.setFont(ff);
        
        
        lbl_Level = new JLabel("Level : ");
        lbl_Level.setBounds(40,160,130,20);//40,220,90,20
        lbl_Level.setFont(ff);
        
        lbl_Credit = new JLabel("Credit : ");
        lbl_Credit.setBounds(360,130,90,20);//360,220,90,20
        lbl_Credit.setFont(ff);
        
        lbl_StartDate = new JLabel("Start Date : ");
         lbl_StartDate.setBounds(360,250,90,20);
        lbl_StartDate.setFont(ff);
        
        lbl_CompletionDate = new JLabel("Completion Date : ");
         lbl_CompletionDate.setBounds(360,280,130,20);
        lbl_CompletionDate.setFont(ff);
        
        lbl_NumberOfAssessment = new JLabel("Number Of Assessment : ");
        lbl_NumberOfAssessment.setBounds(360,160,200,20);
        lbl_NumberOfAssessment.setFont(ff);
        
        lbl_Course_Leader = new JLabel("Course Leader : ");
        lbl_Course_Leader.setBounds(40,250,130,20);
        lbl_Course_Leader.setFont(ff);
        
        
        txt_CourseID = new JTextField(20);
        txt_CourseID.setBounds(170,100,150,23);
        //txt_CourseID.setBorder(null);
        txt_CourseID.setFont(ftxt);
        
        txt_CourseName = new JTextField(20);
        txt_CourseName.setBounds(550,100,150,23);
       // txt_CourseName.setBorder(null);
        txt_CourseName.setFont(ftxt);
        
        txt_Duration = new JTextField(20);
        txt_Duration.setBounds(170,130,150,23);
        //txt_Duration.setBorder(null);
        txt_Duration.setFont(ftxt);
        
        txt_Lecturer_Name = new JTextField(20);
        txt_Lecturer_Name.setBounds(170,280,150,23);//170,180,150,20txt_InstructorName
        //txt_Lecturer_Name.setBorder(null);
        txt_Lecturer_Name.setFont(ftxt);
        
         txt_InstructorName = new JTextField(20);
        txt_InstructorName.setBounds(170,280,150,23);//170,180,150,20
        //txt_Lecturer_Name.setBorder(null);
        txt_InstructorName.setFont(ftxt);
        txt_InstructorName.setVisible(false);
        
        txt_Level = new JTextField(20);
        txt_Level.setBounds(170,160,150,23);
        //txt_Level.setBorder(null);
        txt_Level.setFont(ftxt);
        
        txt_Credit = new JTextField(20);
        txt_Credit.setBounds(550,130,150,23);
        //txt_Credit.setBorder(null);
        txt_Credit.setFont(ftxt);
        
        txt_preRequisite = new JTextField(20);
        txt_preRequisite.setBounds(550,130,150,23);
        //txt_Credit.setBorder(null);
        txt_preRequisite.setFont(ftxt);
        txt_preRequisite.setVisible(false);
        
        txt_StartDate = new JTextField(20);
        txt_StartDate.setBounds(550,250,150,23); 
        
        txt_CompletionDate = new JTextField(20);
        txt_CompletionDate.setBounds(550,280,150,23); 
        
        txt_ExamDate = new JTextField(20);
        txt_ExamDate.setBounds(170,310,150,23); 
        txt_ExamDate.setVisible(false);

        


        
        txt_NumberOfAssessment = new JTextField(20);
        txt_NumberOfAssessment.setBounds(550,160,150,23); 
        
        txt_Course_Leader = new JTextField(20);
        txt_Course_Leader.setBounds(170,250,150,23);
        
        //JFrame jf =new JFrame("Course Regisataraion")
        panel_Courses.add(lbl_Academic);
        panel_Courses.add(lbl_NonAcademic);
        panel_Courses.add(btnAcademic);
        panel_Courses.add(btnNonAcademic);
        panel_Courses.add(lbl_CourseID);
        panel_Courses.add(txt_CourseID);
        panel_Courses.add(lbl_Duration);
        panel_Courses.add(txt_Duration);
        panel_Courses.add(lbl_CourseName);
        panel_Courses.add(txt_CourseName);
        panel_Courses.add(lbl_Lecturer_Name);
        panel_Courses.add(txt_Lecturer_Name);
        panel_Courses.add(lbl_Course_Leader);
        panel_Courses.add(txt_Course_Leader);
        panel_Courses.add(lbl_Level);
        panel_Courses.add(txt_Level);
        panel_Courses.add(lbl_NumberOfAssessment);
        panel_Courses.add(txt_NumberOfAssessment);
        panel_Courses.add(lbl_StartDate);
        panel_Courses.add(txt_StartDate);
        panel_Courses.add(lbl_CompletionDate);
        panel_Courses.add(txt_CompletionDate);
        panel_Courses.add(lbl_Credit);
        panel_Courses.add(txt_Credit);//
        panel_Courses.add(lbl_InstructorName);
        panel_Courses.add(txt_InstructorName);
        panel_Courses.add(lbl_ExamDate);
        panel_Courses.add(txt_ExamDate);
        panel_Courses.add(lbl_preRequisite);
        panel_Courses.add(txt_preRequisite);
        
        panel_Courses.add(btnAdd);
        panel_Courses.add(btnRegister);
        panel_Courses.add(btnDisplay);
        panel_Courses.add(btnExit);
        panel_Courses.add(btnClear);
        panel_Courses.add(btnRemove);
        
        
        
        add(panel_Courses);
        
        
        setBounds(280,155,765,485);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    public static void main(String[]args){
        new IngCollege();
    }

   
}