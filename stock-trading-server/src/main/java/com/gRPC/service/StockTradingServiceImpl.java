package com.gRPC.stock_trading_server.service;

import com.gRPC.StockRequest;
import com.gRPC.StockResponse;
import com.gRPC.StockTradingServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.springframework.grpc.server.service.GrpcService;

@GrpcService
public class StockTradingServiceImpl extends StockTradingServiceGrpc.StockTradingServiceImplBase {

    @Override
    public void getStockPrice(StockRequest request, StreamObserver<StockResponse> responseObserver) {
        super.getStockPrice(request, responseObserver);
    }
}
