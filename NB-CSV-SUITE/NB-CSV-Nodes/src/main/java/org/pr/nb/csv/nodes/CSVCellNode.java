/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pr.nb.csv.nodes;

import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.util.lookup.Lookups;
import org.pr.nb.csv.nodes.data.CSVCell;

/**
 *
 * @author Mahakaal
 */
public class CSVCellNode extends AbstractNode {

    public enum CELL_TYPE {
        CHARACTER, NUMERIC, DATETIME
    }
    private CELL_TYPE type = CELL_TYPE.CHARACTER;

    public CSVCellNode(CSVCell key) {
        super(Children.LEAF, Lookups.singleton(key));
        setDisplayName(key.getCellValue());
        setIconBaseWithExtension("org/pr/nb/csv/nodes/cell16.png");
    }

    public CELL_TYPE getType() {
        return type;
    }

    public void setType(CELL_TYPE type) {
        this.type = type;
    }
    
    
    
}