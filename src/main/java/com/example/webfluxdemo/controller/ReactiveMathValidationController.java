package com.example.webfluxdemo.controller;

import com.example.webfluxdemo.exception.InputValidationException;
import com.example.webfluxdemo.dto.Response;
import com.example.webfluxdemo.service.ReactiveMathService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("reactive-math")
@RequiredArgsConstructor
public class ReactiveMathValidationController {

    private final ReactiveMathService reactiveMathService;

    @GetMapping("square/{input}/throw")
    public Mono<Response> findSquare(@PathVariable int input) {
        if(input < 10 || input > 20)
            throw new InputValidationException(input);
        return this.reactiveMathService.findSquare(input);
    }
}
