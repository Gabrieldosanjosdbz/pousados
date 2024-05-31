-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3307
-- Tempo de geração: 14/05/2024 às 16:58
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `pousados`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `clientes`
--

CREATE TABLE `clientes` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `cpf` char(11) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  `ddd` char(2) NOT NULL,
  `telefone` char(9) NOT NULL,
  `cidade` varchar(20) NOT NULL,
  `estado` varchar(20) NOT NULL,
  `email` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `nome` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `senha` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `login`
--

INSERT INTO `login` (`id`, `nome`, `email`, `senha`) VALUES
(1, 'gabriel', 'gabrieldosanjosdbz@gmail.com', '123456789'),
(2, 'brennon', 'brennonmeireles@gmail.com', '123456789');

-- --------------------------------------------------------

--
-- Estrutura para tabela `quartos`
--

CREATE TABLE `quartos` (
  `numero_quarto` int(11) NOT NULL,
  `preco` decimal(10,0) NOT NULL,
  `descricao` text NOT NULL,
  `disponivel` tinyint(1) NOT NULL DEFAULT 0,
  `prev_entrada` date DEFAULT NULL,
  `prev_saida` date DEFAULT NULL,
  `id_cliente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `quartos`
--

INSERT INTO `quartos` (`numero_quarto`, `preco`, `descricao`, `disponivel`, `prev_entrada`, `prev_saida`, `id_cliente`) VALUES
(1, 300, 'Este quarto simples oferece o básico para uma estadia confortável. Com uma decoração minimalista e funcional, possui uma cama de casal ou duas de solteiro, uma pequena mesa de trabalho, um armário compacto e uma televisão de tela plana. O banheiro é limpo e equipado com um chuveiro, toalhas macias e amenidades básicas de banho. Ideal para viajantes que procuram um lugar tranquilo para descansar após um dia agitado.', 1, NULL, NULL, NULL),
(2, 600, 'Este quarto médio proporciona uma experiência mais aconchegante e espaçosa. Com uma decoração contemporânea e elegante, o quarto dispõe de uma cama king-size com lençóis de alta qualidade, travesseiros extras e um edredom macio. A área de estar é confortável, com uma poltrona ou um sofá, uma mesa de café e uma estação de trabalho bem iluminada. O banheiro é espaçoso, revestido com mármore ou azulejos modernos, e equipado com uma banheira profunda e produtos de banho de marca.', 1, NULL, NULL, NULL),
(3, 820, 'Este quarto de luxo redefine o conforto e o requinte. Com uma decoração sofisticada e detalhes luxuosos, o quarto apresenta uma cama king-size com lençóis de algodão egípcio, travesseiros de plumas de ganso e um edredom de seda. A área de estar é espaçosa e elegantemente mobiliada, com um sofá de designer, poltronas estofadas e uma mesa de jantar para quatro pessoas. O banheiro é um verdadeiro santuário, equipado com uma banheira de hidromassagem, um chuveiro de chuva, roupões de banho macios e produtos de banho de luxo. Além disso, os hóspedes deste quarto desfrutam de comodidades exclusivas, como serviço de mordomo 24 horas, acesso prioritário ao spa e opções de refeições personalizadas no quarto.', 1, NULL, NULL, NULL),
(4, 300, 'Este quarto simples oferece o básico para uma estadia confortável. Com uma decoração minimalista e funcional, possui uma cama de casal ou duas de solteiro, uma pequena mesa de trabalho, um armário compacto e uma televisão de tela plana. O banheiro é limpo e equipado com um chuveiro, toalhas macias e amenidades básicas de banho. Ideal para viajantes que procuram um lugar tranquilo para descansar após um dia agitado.', 1, NULL, NULL, NULL),
(5, 600, 'Este quarto médio proporciona uma experiência mais aconchegante e espaçosa. Com uma decoração contemporânea e elegante, o quarto dispõe de uma cama king-size com lençóis de alta qualidade, travesseiros extras e um edredom macio. A área de estar é confortável, com uma poltrona ou um sofá, uma mesa de café e uma estação de trabalho bem iluminada. O banheiro é espaçoso, revestido com mármore ou azulejos modernos, e equipado com uma banheira profunda e produtos de banho de marca.', 1, NULL, NULL, NULL),
(6, 820, 'Este quarto de luxo redefine o conforto e o requinte. Com uma decoração sofisticada e detalhes luxuosos, o quarto apresenta uma cama king-size com lençóis de algodão egípcio, travesseiros de plumas de ganso e um edredom de seda. A área de estar é espaçosa e elegantemente mobiliada, com um sofá de designer, poltronas estofadas e uma mesa de jantar para quatro pessoas. O banheiro é um verdadeiro santuário, equipado com uma banheira de hidromassagem, um chuveiro de chuva, roupões de banho macios e produtos de banho de luxo. Além disso, os hóspedes deste quarto desfrutam de comodidades exclusivas, como serviço de mordomo 24 horas, acesso prioritário ao spa e opções de refeições personalizadas no quarto. ', 1, NULL, NULL, NULL),
(7, 300, 'Este quarto simples oferece o básico para uma estadia confortável. Com uma decoração minimalista e funcional, possui uma cama de casal ou duas de solteiro, uma pequena mesa de trabalho, um armário compacto e uma televisão de tela plana. O banheiro é limpo e equipado com um chuveiro, toalhas macias e amenidades básicas de banho. Ideal para viajantes que procuram um lugar tranquilo para descansar após um dia agitado.', 1, NULL, NULL, NULL),
(8, 600, 'Este quarto médio proporciona uma experiência mais aconchegante e espaçosa. Com uma decoração contemporânea e elegante, o quarto dispõe de uma cama king-size com lençóis de alta qualidade, travesseiros extras e um edredom macio. A área de estar é confortável, com uma poltrona ou um sofá, uma mesa de café e uma estação de trabalho bem iluminada. O banheiro é espaçoso, revestido com mármore ou azulejos modernos, e equipado com uma banheira profunda e produtos de banho de marca.', 1, NULL, NULL, NULL),
(9, 820, 'Este quarto de luxo redefine o conforto e o requinte. Com uma decoração sofisticada e detalhes luxuosos, o quarto apresenta uma cama king-size com lençóis de algodão egípcio, travesseiros de plumas de ganso e um edredom de seda. A área de estar é espaçosa e elegantemente mobiliada, com um sofá de designer, poltronas estofadas e uma mesa de jantar para quatro pessoas. O banheiro é um verdadeiro santuário, equipado com uma banheira de hidromassagem, um chuveiro de chuva, roupões de banho macios e produtos de banho de luxo. Além disso, os hóspedes deste quarto desfrutam de comodidades exclusivas, como serviço de mordomo 24 horas, acesso prioritário ao spa e opções de refeições personalizadas no quarto. ', 1, NULL, NULL, NULL),
(10, 300, 'Este quarto simples oferece o básico para uma estadia confortável. Com uma decoração minimalista e funcional, possui uma cama de casal ou duas de solteiro, uma pequena mesa de trabalho, um armário compacto e uma televisão de tela plana. O banheiro é limpo e equipado com um chuveiro, toalhas macias e amenidades básicas de banho. Ideal para viajantes que procuram um lugar tranquilo para descansar após um dia agitado.', 1, NULL, NULL, NULL),
(11, 600, 'Este quarto médio proporciona uma experiência mais aconchegante e espaçosa. Com uma decoração contemporânea e elegante, o quarto dispõe de uma cama king-size com lençóis de alta qualidade, travesseiros extras e um edredom macio. A área de estar é confortável, com uma poltrona ou um sofá, uma mesa de café e uma estação de trabalho bem iluminada. O banheiro é espaçoso, revestido com mármore ou azulejos modernos, e equipado com uma banheira profunda e produtos de banho de marca.', 1, NULL, NULL, NULL),
(12, 820, 'Este quarto de luxo redefine o conforto e o requinte. Com uma decoração sofisticada e detalhes luxuosos, o quarto apresenta uma cama king-size com lençóis de algodão egípcio, travesseiros de plumas de ganso e um edredom de seda. A área de estar é espaçosa e elegantemente mobiliada, com um sofá de designer, poltronas estofadas e uma mesa de jantar para quatro pessoas. O banheiro é um verdadeiro santuário, equipado com uma banheira de hidromassagem, um chuveiro de chuva, roupões de banho macios e produtos de banho de luxo. Além disso, os hóspedes deste quarto desfrutam de comodidades exclusivas, como serviço de mordomo 24 horas, acesso prioritário ao spa e opções de refeições personalizadas no quarto. ', 1, NULL, NULL, NULL),
(13, 300, 'Este quarto simples oferece o básico para uma estadia confortável. Com uma decoração minimalista e funcional, possui uma cama de casal ou duas de solteiro, uma pequena mesa de trabalho, um armário compacto e uma televisão de tela plana. O banheiro é limpo e equipado com um chuveiro, toalhas macias e amenidades básicas de banho. Ideal para viajantes que procuram um lugar tranquilo para descansar após um dia agitado.', 1, NULL, NULL, NULL),
(14, 600, 'Este quarto médio proporciona uma experiência mais aconchegante e espaçosa. Com uma decoração contemporânea e elegante, o quarto dispõe de uma cama king-size com lençóis de alta qualidade, travesseiros extras e um edredom macio. A área de estar é confortável, com uma poltrona ou um sofá, uma mesa de café e uma estação de trabalho bem iluminada. O banheiro é espaçoso, revestido com mármore ou azulejos modernos, e equipado com uma banheira profunda e produtos de banho de marca.', 1, NULL, NULL, NULL),
(15, 820, 'Este quarto de luxo redefine o conforto e o requinte. Com uma decoração sofisticada e detalhes luxuosos, o quarto apresenta uma cama king-size com lençóis de algodão egípcio, travesseiros de plumas de ganso e um edredom de seda. A área de estar é espaçosa e elegantemente mobiliada, com um sofá de designer, poltronas estofadas e uma mesa de jantar para quatro pessoas. O banheiro é um verdadeiro santuário, equipado com uma banheira de hidromassagem, um chuveiro de chuva, roupões de banho macios e produtos de banho de luxo. Além disso, os hóspedes deste quarto desfrutam de comodidades exclusivas, como serviço de mordomo 24 horas, acesso prioritário ao spa e opções de refeições personalizadas no quarto. ', 1, NULL, NULL, NULL),
(16, 300, 'Este quarto simples oferece o básico para uma estadia confortável. Com uma decoração minimalista e funcional, possui uma cama de casal ou duas de solteiro, uma pequena mesa de trabalho, um armário compacto e uma televisão de tela plana. O banheiro é limpo e equipado com um chuveiro, toalhas macias e amenidades básicas de banho. Ideal para viajantes que procuram um lugar tranquilo para descansar após um dia agitado.', 1, NULL, NULL, NULL),
(17, 600, 'Este quarto médio proporciona uma experiência mais aconchegante e espaçosa. Com uma decoração contemporânea e elegante, o quarto dispõe de uma cama king-size com lençóis de alta qualidade, travesseiros extras e um edredom macio. A área de estar é confortável, com uma poltrona ou um sofá, uma mesa de café e uma estação de trabalho bem iluminada. O banheiro é espaçoso, revestido com mármore ou azulejos modernos, e equipado com uma banheira profunda e produtos de banho de marca.', 1, NULL, NULL, NULL),
(18, 820, 'Este quarto de luxo redefine o conforto e o requinte. Com uma decoração sofisticada e detalhes luxuosos, o quarto apresenta uma cama king-size com lençóis de algodão egípcio, travesseiros de plumas de ganso e um edredom de seda. A área de estar é espaçosa e elegantemente mobiliada, com um sofá de designer, poltronas estofadas e uma mesa de jantar para quatro pessoas. O banheiro é um verdadeiro santuário, equipado com uma banheira de hidromassagem, um chuveiro de chuva, roupões de banho macios e produtos de banho de luxo. Além disso, os hóspedes deste quarto desfrutam de comodidades exclusivas, como serviço de mordomo 24 horas, acesso prioritário ao spa e opções de refeições personalizadas no quarto. ', 1, NULL, NULL, NULL),
(19, 300, 'Este quarto simples oferece o básico para uma estadia confortável. Com uma decoração minimalista e funcional, possui uma cama de casal ou duas de solteiro, uma pequena mesa de trabalho, um armário compacto e uma televisão de tela plana. O banheiro é limpo e equipado com um chuveiro, toalhas macias e amenidades básicas de banho. Ideal para viajantes que procuram um lugar tranquilo para descansar após um dia agitado.', 1, NULL, NULL, NULL),
(20, 600, 'Este quarto médio proporciona uma experiência mais aconchegante e espaçosa. Com uma decoração contemporânea e elegante, o quarto dispõe de uma cama king-size com lençóis de alta qualidade, travesseiros extras e um edredom macio. A área de estar é confortável, com uma poltrona ou um sofá, uma mesa de café e uma estação de trabalho bem iluminada. O banheiro é espaçoso, revestido com mármore ou azulejos modernos, e equipado com uma banheira profunda e produtos de banho de marca.', 1, NULL, NULL, NULL),
(21, 820, 'Este quarto de luxo redefine o conforto e o requinte. Com uma decoração sofisticada e detalhes luxuosos, o quarto apresenta uma cama king-size com lençóis de algodão egípcio, travesseiros de plumas de ganso e um edredom de seda. A área de estar é espaçosa e elegantemente mobiliada, com um sofá de designer, poltronas estofadas e uma mesa de jantar para quatro pessoas. O banheiro é um verdadeiro santuário, equipado com uma banheira de hidromassagem, um chuveiro de chuva, roupões de banho macios e produtos de banho de luxo. Além disso, os hóspedes deste quarto desfrutam de comodidades exclusivas, como serviço de mordomo 24 horas, acesso prioritário ao spa e opções de refeições personalizadas no quarto. ', 1, NULL, NULL, NULL),
(22, 300, 'Este quarto simples oferece o básico para uma estadia confortável. Com uma decoração minimalista e funcional, possui uma cama de casal ou duas de solteiro, uma pequena mesa de trabalho, um armário compacto e uma televisão de tela plana. O banheiro é limpo e equipado com um chuveiro, toalhas macias e amenidades básicas de banho. Ideal para viajantes que procuram um lugar tranquilo para descansar após um dia agitado.', 1, NULL, NULL, NULL),
(23, 600, 'Este quarto médio proporciona uma experiência mais aconchegante e espaçosa. Com uma decoração contemporânea e elegante, o quarto dispõe de uma cama king-size com lençóis de alta qualidade, travesseiros extras e um edredom macio. A área de estar é confortável, com uma poltrona ou um sofá, uma mesa de café e uma estação de trabalho bem iluminada. O banheiro é espaçoso, revestido com mármore ou azulejos modernos, e equipado com uma banheira profunda e produtos de banho de marca.', 1, NULL, NULL, NULL),
(24, 820, 'Este quarto de luxo redefine o conforto e o requinte. Com uma decoração sofisticada e detalhes luxuosos, o quarto apresenta uma cama king-size com lençóis de algodão egípcio, travesseiros de plumas de ganso e um edredom de seda. A área de estar é espaçosa e elegantemente mobiliada, com um sofá de designer, poltronas estofadas e uma mesa de jantar para quatro pessoas. O banheiro é um verdadeiro santuário, equipado com uma banheira de hidromassagem, um chuveiro de chuva, roupões de banho macios e produtos de banho de luxo. Além disso, os hóspedes deste quarto desfrutam de comodidades exclusivas, como serviço de mordomo 24 horas, acesso prioritário ao spa e opções de refeições personalizadas no quarto. ', 1, NULL, NULL, NULL),
(25, 300, 'Este quarto simples oferece o básico para uma estadia confortável. Com uma decoração minimalista e funcional, possui uma cama de casal ou duas de solteiro, uma pequena mesa de trabalho, um armário compacto e uma televisão de tela plana. O banheiro é limpo e equipado com um chuveiro, toalhas macias e amenidades básicas de banho. Ideal para viajantes que procuram um lugar tranquilo para descansar após um dia agitado.', 1, NULL, NULL, NULL),
(26, 600, 'Este quarto médio proporciona uma experiência mais aconchegante e espaçosa. Com uma decoração contemporânea e elegante, o quarto dispõe de uma cama king-size com lençóis de alta qualidade, travesseiros extras e um edredom macio. A área de estar é confortável, com uma poltrona ou um sofá, uma mesa de café e uma estação de trabalho bem iluminada. O banheiro é espaçoso, revestido com mármore ou azulejos modernos, e equipado com uma banheira profunda e produtos de banho de marca.', 1, NULL, NULL, NULL),
(27, 820, 'Este quarto de luxo redefine o conforto e o requinte. Com uma decoração sofisticada e detalhes luxuosos, o quarto apresenta uma cama king-size com lençóis de algodão egípcio, travesseiros de plumas de ganso e um edredom de seda. A área de estar é espaçosa e elegantemente mobiliada, com um sofá de designer, poltronas estofadas e uma mesa de jantar para quatro pessoas. O banheiro é um verdadeiro santuário, equipado com uma banheira de hidromassagem, um chuveiro de chuva, roupões de banho macios e produtos de banho de luxo. Além disso, os hóspedes deste quarto desfrutam de comodidades exclusivas, como serviço de mordomo 24 horas, acesso prioritário ao spa e opções de refeições personalizadas no quarto. ', 1, NULL, NULL, NULL),
(28, 300, 'Este quarto simples oferece o básico para uma estadia confortável. Com uma decoração minimalista e funcional, possui uma cama de casal ou duas de solteiro, uma pequena mesa de trabalho, um armário compacto e uma televisão de tela plana. O banheiro é limpo e equipado com um chuveiro, toalhas macias e amenidades básicas de banho. Ideal para viajantes que procuram um lugar tranquilo para descansar após um dia agitado.', 1, NULL, NULL, NULL),
(29, 600, 'Este quarto médio proporciona uma experiência mais aconchegante e espaçosa. Com uma decoração contemporânea e elegante, o quarto dispõe de uma cama king-size com lençóis de alta qualidade, travesseiros extras e um edredom macio. A área de estar é confortável, com uma poltrona ou um sofá, uma mesa de café e uma estação de trabalho bem iluminada. O banheiro é espaçoso, revestido com mármore ou azulejos modernos, e equipado com uma banheira profunda e produtos de banho de marca.', 1, NULL, NULL, NULL),
(30, 820, 'Este quarto de luxo redefine o conforto e o requinte. Com uma decoração sofisticada e detalhes luxuosos, o quarto apresenta uma cama king-size com lençóis de algodão egípcio, travesseiros de plumas de ganso e um edredom de seda. A área de estar é espaçosa e elegantemente mobiliada, com um sofá de designer, poltronas estofadas e uma mesa de jantar para quatro pessoas. O banheiro é um verdadeiro santuário, equipado com uma banheira de hidromassagem, um chuveiro de chuva, roupões de banho macios e produtos de banho de luxo. Além disso, os hóspedes deste quarto desfrutam de comodidades exclusivas, como serviço de mordomo 24 horas, acesso prioritário ao spa e opções de refeições personalizadas no quarto. ', 1, NULL, NULL, NULL);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `quartos`
--
ALTER TABLE `quartos`
  ADD PRIMARY KEY (`numero_quarto`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `login`
--
ALTER TABLE `login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `quartos`
--
ALTER TABLE `quartos`
  MODIFY `numero_quarto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
