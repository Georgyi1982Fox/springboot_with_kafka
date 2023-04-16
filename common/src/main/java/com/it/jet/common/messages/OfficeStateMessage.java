package com.it.jet.common.messages;

import com.it.jet.common.bean.Source;
import com.it.jet.common.bean.Type;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class OfficeStateMessage extends Message{
    public OfficeStateMessage(){
        this.source = Source.OFFICE;
        this.type = Type.STATE;
    }

}
