package com.it.jet.common.messages;

import com.it.jet.common.bean.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class OfficeRouteMessage extends Message{
    private Route route;

    public OfficeRouteMessage(){
        this.source = Source.AIRPORT;
        this.type = Type.ROUTE;
    }
    public OfficeRouteMessage(Route val){
        this();
        this.route = val;
    }
}
