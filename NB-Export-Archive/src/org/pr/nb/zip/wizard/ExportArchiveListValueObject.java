/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pr.nb.zip.wizard;

import org.openide.filesystems.FileObject;

/**
 *
 * @author Kaiser
 */
public class ExportArchiveListValueObject implements Comparable<ExportArchiveListValueObject>{
    private Integer rank = 0;

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public FileObject getDataObject() {
        return dataObject;
    }

    public void setDataObject(FileObject dataObject) {
        this.dataObject = dataObject;
    }
    private FileObject dataObject;

    public ExportArchiveListValueObject() {
    }

    public ExportArchiveListValueObject(Integer rank, FileObject dataObject) {
        this.rank = rank;
        this.dataObject = dataObject;
    }

    @Override
    public int compareTo(ExportArchiveListValueObject that) {
        int retValue = -1;
        if(that != null){
            retValue = this.rank.compareTo(that.rank);
        }
        return retValue;
    }

}