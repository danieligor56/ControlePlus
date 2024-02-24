package br.com.ControleEstoque.ConrolePlus.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModdelMapperConfig {


	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
																																																			