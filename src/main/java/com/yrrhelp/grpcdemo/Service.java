package com.yrrhelp.grpcdemo;

import io.grpc.stub.StreamObserver;
import ir.tourismit.tit.core.Request;
import ir.tourismit.tit.core.Response;
import ir.tourismit.tit.core.ServiceGrpc;

public class Service extends ServiceGrpc.ServiceImplBase {
    @Override
    public void service(Request request, StreamObserver<Response> responseObserver) {
        System.out.println("Inside login");

        Response.Builder response = Response.newBuilder();
        response.setProcessReference(request.getProcessReference());
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }


}
