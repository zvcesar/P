
package Vista;

import Controlador.Controlador;
import Modelo.MetodosNodos;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class VentanaListas extends javax.swing.JFrame {

    Controlador controlador;
    
    public VentanaListas() {
        initComponents();
        
        controlador=new Controlador(this);
        this.jb_Agregar.addActionListener(controlador);
        this.jb_Eliminar.addActionListener(controlador);
        this.jb_Generar.addActionListener(controlador);
        
        this.jb_MayorQue.addActionListener(controlador);
        this.jb_MenorQue.addActionListener(controlador);
        this.jb_Modificar.addActionListener(controlador);
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jt_DatoAgregarFinal = new javax.swing.JTextField();
        jb_Agregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_ReporteListas = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jt_CantidadElementos = new javax.swing.JTextField();
        jb_Generar = new javax.swing.JButton();
        jt_DatoModificar = new javax.swing.JTextField();
        jb_Modificar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jt_NuevoValor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jt_DatoEliminar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jb_Eliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jb_MayorQue = new javax.swing.JButton();
        jb_MenorQue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setText("Listas Enlazadas. Lic. Roberto Escobar Agüero");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 21, 510, -1));

        jLabel2.setText("Cantidad de Elementos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));
        getContentPane().add(jt_DatoAgregarFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 147, -1));

        jb_Agregar.setText("Agregar");
        getContentPane().add(jb_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 90, -1));

        jta_ReporteListas.setColumns(20);
        jta_ReporteListas.setRows(5);
        jScrollPane1.setViewportView(jta_ReporteListas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 397, 506, 170));

        jLabel3.setText("Agregar Dato Al Final");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 240, -1));
        getContentPane().add(jt_CantidadElementos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 147, -1));

        jb_Generar.setText("Generar");
        getContentPane().add(jb_Generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 90, -1));
        getContentPane().add(jt_DatoModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 147, -1));

        jb_Modificar.setText("Modificar");
        getContentPane().add(jb_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 90, -1));

        jLabel4.setText("Dato a Modificar");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 183, -1));
        getContentPane().add(jt_NuevoValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 147, -1));

        jLabel5.setText("Nuevo Valor");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 183, -1));
        getContentPane().add(jt_DatoEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 147, -1));

        jLabel6.setText("Dato a Eliminar");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 183, -1));

        jb_Eliminar.setText("Eliminar");
        getContentPane().add(jb_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 90, -1));

        jLabel7.setText("Ordenar Lista");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 183, -1));

        jb_MayorQue.setText(">");
        getContentPane().add(jb_MayorQue, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 90, -1));

        jb_MenorQue.setText("<");
        getContentPane().add(jb_MenorQue, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    public static void main(String args[]) {
     
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaListas().setVisible(true);
            }
        });
    }

    public String getJt_CantidadElementos() {
        return this.jt_CantidadElementos.getText();
    }

    public void setJt_CantidadElementos(String dato) {
        this.jt_CantidadElementos.setText(dato);
    }

    public String getJt_DatoAgregarFinal() {
        return jt_DatoAgregarFinal.getText();
    }

    public void setJt_DatoAgregarFinal(String dato) {
        this.jt_DatoAgregarFinal.setText(dato);
    }

    public String getJt_DatoEliminar() {
        return jt_DatoEliminar.getText();
    }

    public void setJt_DatoEliminar(String dato) {
        this.jt_DatoEliminar.setText(dato);
    }

    public String getJt_DatoModificar() {
        return jt_DatoModificar.getText();
    }

    public void setJt_DatoModificar(String dato) {
        this.jt_DatoModificar.setText(dato);
    }

    public String getJt_NuevoValor() {
        return jt_NuevoValor.getText();
    }

    public void setJt_NuevoValor(String dato) {
        this.jt_NuevoValor.setText(dato);
    }

    public String getJta_ReporteListas() {
        return jta_ReporteListas.getText();
    }

    public void setJta_ReporteListas(String dato) {
        this.jta_ReporteListas.setText(dato);
    }
    public void limpiarCampos()
    {
        this.jt_CantidadElementos.setText("");
        this.jt_DatoAgregarFinal.setText("");
        this.jt_DatoEliminar.setText("");
        this.jt_NuevoValor.setText("");
        this.jt_DatoModificar.setText("");
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_Agregar;
    private javax.swing.JButton jb_Eliminar;
    private javax.swing.JButton jb_Generar;
    private javax.swing.JButton jb_MayorQue;
    private javax.swing.JButton jb_MenorQue;
    private javax.swing.JButton jb_Modificar;
    private javax.swing.JTextField jt_CantidadElementos;
    private javax.swing.JTextField jt_DatoAgregarFinal;
    private javax.swing.JTextField jt_DatoEliminar;
    private javax.swing.JTextField jt_DatoModificar;
    private javax.swing.JTextField jt_NuevoValor;
    private javax.swing.JTextArea jta_ReporteListas;
    // End of variables declaration//GEN-END:variables
}
