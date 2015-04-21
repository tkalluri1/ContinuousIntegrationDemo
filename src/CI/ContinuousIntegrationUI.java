/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CI;

import java.util.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class ContinuousIntegrationUI extends javax.swing.JFrame {

    /**
     * Creates new form ContinuousIntegrationUI
     */
    public ContinuousIntegrationUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        stringPanel = new javax.swing.JPanel();
        stringLabel = new javax.swing.JLabel();
        stringText = new javax.swing.JTextField();
        reverseButton = new javax.swing.JButton();
        upperCaseButton = new javax.swing.JButton();
        lowerCaseButton = new javax.swing.JButton();
        concatStringLabel = new javax.swing.JLabel();
        concatStringText = new javax.swing.JTextField();
        concatButton = new javax.swing.JButton();
        splitButton = new javax.swing.JButton();
        switchButton = new javax.swing.JButton();
        stringAnswerLabel = new javax.swing.JLabel();
        mathPanel = new javax.swing.JPanel();
        plusButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        firstNumberLabel = new javax.swing.JLabel();
        secondNumberLabel1 = new javax.swing.JLabel();
        mathAnswerLabel = new javax.swing.JLabel();
        firstNumberText = new javax.swing.JTextField();
        secondNumberText = new javax.swing.JTextField();
        factorialButton = new javax.swing.JButton();
        powerButton = new javax.swing.JButton();
        logButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Functions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        stringPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "StringFunctions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        stringLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        stringLabel.setText("String :");

        reverseButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        reverseButton.setText("Reverse");
        reverseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reverseButtonActionPerformed(evt);
            }
        });

        upperCaseButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        upperCaseButton.setText("Upper Case");
        upperCaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upperCaseButtonActionPerformed(evt);
            }
        });

        lowerCaseButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lowerCaseButton.setText("Lower  Case");
        lowerCaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowerCaseButtonActionPerformed(evt);
            }
        });

        concatStringLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        concatStringLabel.setText("Concat String / Split Token :");

        concatButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        concatButton.setText("Concat");
        concatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concatButtonActionPerformed(evt);
            }
        });

        splitButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        splitButton.setText("Split");
        splitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                splitButtonActionPerformed(evt);
            }
        });

        switchButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        switchButton.setText("Toggle Case");
        switchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchButtonActionPerformed(evt);
            }
        });

        stringAnswerLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        javax.swing.GroupLayout stringPanelLayout = new javax.swing.GroupLayout(stringPanel);
        stringPanel.setLayout(stringPanelLayout);
        stringPanelLayout.setHorizontalGroup(
            stringPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stringPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(upperCaseButton)
                .addGap(53, 53, 53)
                .addComponent(switchButton)
                .addGap(72, 72, 72))
            .addGroup(stringPanelLayout.createSequentialGroup()
                .addGroup(stringPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stringPanelLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(stringPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(concatStringLabel)
                            .addComponent(stringLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(stringPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(stringText, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(concatStringText, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(stringPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(stringPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lowerCaseButton)
                            .addComponent(concatButton))
                        .addGap(68, 68, 68)
                        .addComponent(splitButton)
                        .addGap(59, 59, 59)
                        .addComponent(reverseButton))
                    .addGroup(stringPanelLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(stringAnswerLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        stringPanelLayout.setVerticalGroup(
            stringPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stringPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(stringPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stringLabel)
                    .addComponent(stringText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(stringPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(concatStringLabel)
                    .addComponent(concatStringText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(stringPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lowerCaseButton)
                    .addComponent(upperCaseButton)
                    .addComponent(switchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(stringPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(concatButton)
                    .addComponent(splitButton)
                    .addComponent(reverseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(stringAnswerLabel)
                .addContainerGap())
        );

        mathPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MathFunctions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        plusButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plusButton.setText("+");
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });

        minusButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        minusButton.setText("-");
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });

        multiplyButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        multiplyButton.setText("*");
        multiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyButtonActionPerformed(evt);
            }
        });

        divideButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        divideButton.setText("/");
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButtonActionPerformed(evt);
            }
        });

        firstNumberLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        firstNumberLabel.setText("First Number :");

        secondNumberLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        secondNumberLabel1.setText("Second Number :");

        mathAnswerLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        factorialButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        factorialButton.setText("Factorial");
        factorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialButtonActionPerformed(evt);
            }
        });

        powerButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        powerButton.setText("Power");
        powerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerButtonActionPerformed(evt);
            }
        });

        logButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        logButton.setText("Log");
        logButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mathPanelLayout = new javax.swing.GroupLayout(mathPanel);
        mathPanel.setLayout(mathPanelLayout);
        mathPanelLayout.setHorizontalGroup(
            mathPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mathPanelLayout.createSequentialGroup()
                .addGroup(mathPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mathPanelLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(mathPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secondNumberLabel1)
                            .addComponent(firstNumberLabel))
                        .addGap(83, 83, 83)
                        .addGroup(mathPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secondNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mathPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(plusButton)
                        .addGap(18, 18, 18)
                        .addComponent(minusButton)
                        .addGap(18, 18, 18)
                        .addComponent(multiplyButton)
                        .addGap(18, 18, 18)
                        .addGroup(mathPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mathAnswerLabel)
                            .addGroup(mathPanelLayout.createSequentialGroup()
                                .addComponent(divideButton)
                                .addGap(18, 18, 18)
                                .addComponent(factorialButton)
                                .addGap(18, 18, 18)
                                .addComponent(powerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(logButton)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        mathPanelLayout.setVerticalGroup(
            mathPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mathPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(mathPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNumberLabel)
                    .addComponent(firstNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mathPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secondNumberLabel1)
                    .addComponent(secondNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(mathPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plusButton)
                    .addComponent(minusButton)
                    .addComponent(multiplyButton)
                    .addComponent(divideButton)
                    .addComponent(factorialButton)
                    .addComponent(powerButton)
                    .addComponent(logButton))
                .addGap(14, 14, 14)
                .addComponent(mathAnswerLabel))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mathPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stringPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(139, 139, 139))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mathPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stringPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPanel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    double number1, number2, result;
    String inputString, concatString, resultString;
    MathFunctions mathFunction = new MathFunctions();
    StringFunctions stringFunction = new StringFunctions();
    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
        // TODO add your handling code here:
        try {
            number1 = Double.parseDouble(this.firstNumberText.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bad number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            number2 = Double.parseDouble(this.secondNumberText.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bad number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        result = mathFunction.add(number1, number2);
        this.mathAnswerLabel.setText("Answer is " + "\"" + result + "\"");
    }//GEN-LAST:event_plusButtonActionPerformed

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
        // TODO add your handling code here:
        try {
            number1 = Double.parseDouble(this.firstNumberText.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bad number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            number2 = Double.parseDouble(this.secondNumberText.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bad number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        result = mathFunction.subtract(number1, number2);
        this.mathAnswerLabel.setText("Answer is " + "\"" + result + "\"");
    }//GEN-LAST:event_minusButtonActionPerformed

    private void multiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyButtonActionPerformed
        // TODO add your handling code here:
        try {
            number1 = Double.parseDouble(this.firstNumberText.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bad number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            number2 = Double.parseDouble(this.secondNumberText.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bad number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        result = mathFunction.multiply(number1, number2);
        this.mathAnswerLabel.setText("Answer is " + "\"" + result + "\"");
    }//GEN-LAST:event_multiplyButtonActionPerformed

    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideButtonActionPerformed
        // TODO add your handling code here:
        try {
            number1 = Double.parseDouble(this.firstNumberText.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bad number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            number2 = Double.parseDouble(this.secondNumberText.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bad number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        result = mathFunction.divide(number1, number2);
        this.mathAnswerLabel.setText("Answer is " + "\"" + result + "\"");
    }//GEN-LAST:event_divideButtonActionPerformed

    private void reverseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reverseButtonActionPerformed
        // TODO add your handling code here:
        inputString = this.stringText.getText();
        if(inputString.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bad String", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        resultString = stringFunction.reverse(inputString);
        this.stringAnswerLabel.setText("Modified String is " + "\"" + resultString + "\"");
    }//GEN-LAST:event_reverseButtonActionPerformed

    private void upperCaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upperCaseButtonActionPerformed
        // TODO add your handling code here:
        inputString = this.stringText.getText();
        if(inputString.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bad String", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        resultString = stringFunction.upperCase(inputString);
        this.stringAnswerLabel.setText("Modified String is " + "\"" + resultString + "\"");
    }//GEN-LAST:event_upperCaseButtonActionPerformed

    private void lowerCaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowerCaseButtonActionPerformed
        // TODO add your handling code here:
        inputString = this.stringText.getText();
        if(inputString.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bad String", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        resultString = stringFunction.lowerCase(inputString);
        this.stringAnswerLabel.setText("Modified String is " + "\"" + resultString + "\"");
    }//GEN-LAST:event_lowerCaseButtonActionPerformed

    private void concatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concatButtonActionPerformed
        // TODO add your handling code here:
        inputString = this.stringText.getText();
        concatString = this.concatStringText.getText();
        if(inputString.isEmpty() && concatString.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bad String", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        resultString = stringFunction.concat(inputString, concatString);
        this.stringAnswerLabel.setText("Modified String is " + "\"" + resultString + "\"");
    }//GEN-LAST:event_concatButtonActionPerformed

    private void factorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorialButtonActionPerformed
        // TODO add your handling code here:
        try {
            if(!this.firstNumberText.getText().isEmpty()) { 
                number1 = Double.parseDouble(this.firstNumberText.getText());
            } else {
                number1 = Double.parseDouble(this.secondNumberText.getText());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bad number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(number1 < 0) {
            JOptionPane.showMessageDialog(this, "Bad number", "Error", JOptionPane.ERROR_MESSAGE);
            return;    
        } else {
            result = mathFunction.factorial(number1);
        }
        this.mathAnswerLabel.setText("Answer is " + "\"" + result + "\"");    
    }//GEN-LAST:event_factorialButtonActionPerformed

    private void powerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerButtonActionPerformed
        // TODO add your handling code here:
         try {
            number1 = Double.parseDouble(this.firstNumberText.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bad number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            number2 = Double.parseDouble(this.secondNumberText.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bad number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        result = mathFunction.power(number1, number2);
        this.mathAnswerLabel.setText("Answer is " + "\"" + result + "\"");
    }//GEN-LAST:event_powerButtonActionPerformed

    private void logButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logButtonActionPerformed
        // TODO add your handling code here:
        try {
            if(!this.firstNumberText.getText().isEmpty()) { 
                number1 = Double.parseDouble(this.firstNumberText.getText());
            } else {
                number1 = Double.parseDouble(this.secondNumberText.getText());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bad number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(number1 < 0) {
            JOptionPane.showMessageDialog(this, "Bad number", "Error", JOptionPane.ERROR_MESSAGE);
            return;    
        } else {
            result = mathFunction.log(number1);
        }    
        this.mathAnswerLabel.setText("Answer is " + "\"" + result + "\"");
        
    }//GEN-LAST:event_logButtonActionPerformed

    private void splitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_splitButtonActionPerformed
        // TODO add your handling code here:
        inputString = this.stringText.getText();
        if(inputString.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bad String", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        concatString = this.concatStringText.getText();
        resultString = stringFunction.split(inputString, concatString);
        this.stringAnswerLabel.setText("Modified String is " + "\"" + resultString + "\"");
    }//GEN-LAST:event_splitButtonActionPerformed

    private void switchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchButtonActionPerformed
        // TODO add your handling code here:
        inputString = this.stringText.getText();
        if(inputString.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bad String", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        resultString = stringFunction.toggleCase(inputString);
        this.stringAnswerLabel.setText("Modified String is " + "\"" + resultString + "\"");
    }//GEN-LAST:event_switchButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ContinuousIntegrationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContinuousIntegrationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContinuousIntegrationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContinuousIntegrationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContinuousIntegrationUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton concatButton;
    private javax.swing.JLabel concatStringLabel;
    private javax.swing.JTextField concatStringText;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton factorialButton;
    private javax.swing.JLabel firstNumberLabel;
    private javax.swing.JTextField firstNumberText;
    private javax.swing.JButton logButton;
    private javax.swing.JButton lowerCaseButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel mathAnswerLabel;
    private javax.swing.JPanel mathPanel;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JButton powerButton;
    private javax.swing.JButton reverseButton;
    private javax.swing.JLabel secondNumberLabel1;
    private javax.swing.JTextField secondNumberText;
    private javax.swing.JButton splitButton;
    private javax.swing.JLabel stringAnswerLabel;
    private javax.swing.JLabel stringLabel;
    private javax.swing.JPanel stringPanel;
    private javax.swing.JTextField stringText;
    private javax.swing.JButton switchButton;
    private javax.swing.JButton upperCaseButton;
    // End of variables declaration//GEN-END:variables
}
