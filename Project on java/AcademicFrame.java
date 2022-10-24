import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AcademicFrame extends JFrame
{
    private JButton btnAcademic,btnNonAcademic;
    private JPanel panelAcademic;
    private JLabel lbl_Academic,lbl_CourseID,lbl_CourseName,lbl_Duration,lbl_Lecturer_Name,lbl_Level,lbl_Credit,lbl_Starting_Date,lbl_Completion_Date,lbl_NumberOfAssessment,lbl_Course_Leader;
    private JTextField txt_CourseID,txt_CourseName,txt_Duration,txt_Lecturer_Name,txt_Level,txt_Credit,txt_NumberOfAssessment,txt_Course_Leader;
    private JButton btnDisplay,btnRegister,btnExit,btnAdd,btnClear;
    private JComboBox Jcb_Month,Jcb_Year,Jcb_Day;
    private Font flbl1,ff,ftxt;
    public AcademicFrame()
    {   
        super("Course Registration");
        
        
        
        panelAcademic = new JPanel();
        panelAcademic.setLayout(null);
        panelAcademic.setBackground(Color.YELLOW);
        panelAcademic.setSize(720,420);
        
        
        
        btnAcademic = new JButton("Academic Course");
        btnAcademic.setBounds(170,50,180,25);
        btnAcademic.setBackground(Color.YELLOW);
        


        btnNonAcademic = new JButton("Non Academic Course");
        btnNonAcademic.setBounds(370,50,180,25);
        btnNonAcademic.setBackground(Color.YELLOW);
        
        
        btnDisplay = new JButton("Display");
        btnDisplay.setBounds(290,320,150,20);
        
        btnRegister = new JButton("Register");
        btnRegister.setBounds(500,260,150,20);
        
        
        btnAdd = new JButton("Add");
        btnAdd.setBounds(500,140,150,20);
        
        btnExit = new JButton("Exit");
        btnExit.setBounds(70,320,150,20);
        
        btnClear = new JButton("Clear");
        btnClear.setBounds(500,320,150,20);
        
        flbl1 = new Font("Arial",Font.BOLD,23);
        ff = new Font("Arial",Font.BOLD,14);
        ftxt = new Font("Arial",Font.PLAIN,14);
        
        
        lbl_Academic = new JLabel("Academic Course");
        lbl_Academic.setBounds(260,10,200,30);
        lbl_Academic.setFont(flbl1);
        
        lbl_CourseID = new JLabel("Course ID : ");
        lbl_CourseID.setBounds(40,100,90,20);
        lbl_CourseID.setFont(ff);
        
        lbl_CourseName = new JLabel("Course Name : ");
        lbl_CourseName.setBounds(360,100,130,20);
        lbl_CourseName.setFont(ff);
        
        lbl_Duration = new JLabel("Duration : ");
        lbl_Duration.setBounds(41,140,90,20);
        lbl_Duration.setFont(ff);
        
        
        lbl_Lecturer_Name = new JLabel("Lecturuer Name : ");
        lbl_Lecturer_Name.setBounds(40,180,130,20);
        lbl_Lecturer_Name.setFont(ff);
        
        
        lbl_Level = new JLabel("Level : ");
        lbl_Level.setBounds(40,220,90,20);
        lbl_Level.setFont(ff);
        
        lbl_Credit = new JLabel("Credits : ");
        lbl_Credit.setBounds(360,220,90,20);
        lbl_Credit.setFont(ff);
        
        lbl_Starting_Date = new JLabel("Starting Date : ");
        lbl_Completion_Date = new JLabel("Completion Date : ");
        lbl_NumberOfAssessment = new JLabel("Number Of Assessment : ");
        
        lbl_Course_Leader = new JLabel("Course Leader : ");
        lbl_Course_Leader.setBounds(360,180,130,20);
        lbl_Course_Leader.setFont(ff);
        
        
        txt_CourseID = new JTextField(20);
        txt_CourseID.setBounds(170,100,150,20);
        txt_CourseID.setBorder(null);
        txt_CourseID.setFont(ftxt);
        
        txt_CourseName = new JTextField(20);
        txt_CourseName.setBounds(500,100,150,20);
        txt_CourseName.setFont(ftxt);
        
        txt_Duration = new JTextField(20);
        txt_Duration.setBounds(170,140,150,20);
        txt_Duration.setFont(ftxt);
        
        txt_Lecturer_Name = new JTextField(20);
        txt_Lecturer_Name.setBounds(170,180,150,20);
        txt_Lecturer_Name.setFont(ftxt);
        
        txt_Level = new JTextField(20);
        txt_Level.setBounds(170,220,150,20);
        txt_Level.setFont(ftxt);
        
        txt_Credit = new JTextField(20);
        txt_Credit.setBounds(500,220,150,20);
        txt_Credit.setFont(ftxt);
        
        txt_NumberOfAssessment = new JTextField(20);
        
        txt_Course_Leader = new JTextField(20);
        txt_Course_Leader.setBounds(500,180,150,20);
        
        
        panelAcademic.add(lbl_Academic);
        panelAcademic.add(btnAcademic);
        panelAcademic.add(btnNonAcademic);
        panelAcademic.add(lbl_CourseID);
        panelAcademic.add(txt_CourseID);
        panelAcademic.add(lbl_Duration);
        panelAcademic.add(txt_Duration);
        panelAcademic.add(lbl_CourseName);
        panelAcademic.add(txt_CourseName);
        panelAcademic.add(btnAdd);
        panelAcademic.add(lbl_Lecturer_Name);
        panelAcademic.add(txt_Lecturer_Name);
        panelAcademic.add(lbl_Course_Leader);
        panelAcademic.add(txt_Course_Leader);
        panelAcademic.add(lbl_Level);
        panelAcademic.add(txt_Level);
        panelAcademic.add(lbl_Credit);
        panelAcademic.add(txt_Credit);
        panelAcademic.add(btnRegister);
        panelAcademic.add(btnDisplay);
        panelAcademic.add(btnExit);
        panelAcademic.add(btnClear);
        
        
        
        add(panelAcademic);
        
        
        setBounds(280,155,720,420);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    public static void main(String[]args){
        new AcademicFrame();
    }

   
}


