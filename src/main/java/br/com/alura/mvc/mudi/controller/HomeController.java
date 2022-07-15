package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		
		pedido.setNomeProduto("Xiaomi Redmi Note 10S 128gb 6gb RAM");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/61pOZ7mAn2S._AC_SY450_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Xiaomi-Redmi-Note-10S-128gb/dp/B093FJZYZ5");
		pedido.setDescricao("Uma descrição qualquer para esse pedido");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}
