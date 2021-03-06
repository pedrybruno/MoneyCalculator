CREATE TABLE currency 
   (    code varchar (3) primary key,
        name varchar (30),
        symbol varchar (3));

CREATE TABLE exchanges 
   (	fromCurrency varchar (3),
	toCurrency varchar (3),
        rate double,
        FOREIGN KEY (fromCurrency) references currency(code));

insert into currency values ('ARS','Peso Argentino','$');
insert into currency values ('AUD','Dolar Australiano','A$');
insert into currency values ('BRL','Real Brasileño','R$');
insert into currency values ('CAD','Dolar Canadiense','C$');
insert into currency values ('CHF','Franco Suizo','Fr');
insert into currency values ('CNY','Yuan','¥');
insert into currency values ('CZK','Corona Checa','Kc');
insert into currency values ('DKK','Corona Danesa','Kr');
insert into currency values ('EUR','Euro','€');
insert into currency values ('GBP','Libra Esterlina','£');
insert into currency values ('HKD','Dolar de Hong Kong','HK$');
insert into currency values ('HUF','Forinto hungaro','Ft');
insert into currency values ('JPY','Yen Japones','¥');
insert into currency values ('MXN','Peso Mexicano','$');
insert into currency values ('NOK','Corona Noruega','kr');
insert into currency values ('NZD','Dolar Neozelandes','NZ$');
insert into currency values ('PLN','Zloty','Zt');
insert into currency values ('SEK','Corona Sueca','kr');
insert into currency values ('SGD','Dolar de Singapur','S$');
insert into currency values ('USD','Dolar de Estados Unidos','$');
insert into currency values ('ZAR','Rand','R');


insert into exchanges values ('ZAR','USD',0.101);
insert into exchanges values ('ZAR','GBP',0.0635);
insert into exchanges values ('ZAR','JPY',9.8172);
insert into exchanges values ('ZAR','CHF',0.0912);
insert into exchanges values ('ZAR','ARS',0.5914);
insert into exchanges values ('ZAR','AUD',0.1068);
insert into exchanges values ('ZAR','BRL',0.2217);
insert into exchanges values ('ZAR','CAD',0.1042);
insert into exchanges values ('ZAR','CNY',0.6179);
insert into exchanges values ('ZAR','CZK',1.9039);
insert into exchanges values ('ZAR','DKK',0.5526);
insert into exchanges values ('ZAR','HKD',0.7807);
insert into exchanges values ('ZAR','HUF',22.2676);
insert into exchanges values ('ZAR','MXN',1.3294);
insert into exchanges values ('ZAR','NOK',0.6031);
insert into exchanges values ('ZAR','NZD',0.1224);
insert into exchanges values ('ZAR','PLN',0.3123);
insert into exchanges values ('ZAR','SEK',0.6463);
insert into exchanges values ('ZAR','SGD',0.1264);
insert into exchanges values ('ZAR','EUR',0.06737);
insert into exchanges values ('SGD','USD',0.7986);
insert into exchanges values ('SGD','GBP',0.5024);
insert into exchanges values ('SGD','JPY',77.6403);
insert into exchanges values ('SGD','CHF',0.7215);
insert into exchanges values ('SGD','ARS',4.6773);
insert into exchanges values ('SGD','AUD',0.8449);
insert into exchanges values ('SGD','BRL',1.7534);
insert into exchanges values ('SGD','CAD',0.824);
insert into exchanges values ('SGD','CNY',4.8869);
insert into exchanges values ('SGD','CZK',15.057);
insert into exchanges values ('SGD','DKK',4.3702);
insert into exchanges values ('SGD','HKD',6.1741);
insert into exchanges values ('SGD','HUF',176.1063);
insert into exchanges values ('SGD','MXN',10.5135);
insert into exchanges values ('SGD','NOK',4.7699);
insert into exchanges values ('SGD','NZD',0.968);
insert into exchanges values ('SGD','PLN',2.4699);
insert into exchanges values ('SGD','SEK',5.111);
insert into exchanges values ('SGD','ZAR',7.9086);
insert into exchanges values ('SGD','EUR',0.57657);
insert into exchanges values ('SEK','USD',0.1562);
insert into exchanges values ('SEK','GBP',0.0983);
insert into exchanges values ('SEK','JPY',15.1908);
insert into exchanges values ('SEK','CHF',0.1412);
insert into exchanges values ('SEK','ARS',0.9151);
insert into exchanges values ('SEK','AUD',0.1653);
insert into exchanges values ('SEK','BRL',0.3431);
insert into exchanges values ('SEK','CAD',0.1612);
insert into exchanges values ('SEK','CNY',0.9561);
insert into exchanges values ('SEK','CZK',2.946);
insert into exchanges values ('SEK','DKK',0.8551);
insert into exchanges values ('SEK','HKD',1.208);
insert into exchanges values ('SEK','HUF',34.4562);
insert into exchanges values ('SEK','MXN',2.057);
insert into exchanges values ('SEK','NOK',0.9333);
insert into exchanges values ('SEK','NZD',0.1894);
insert into exchanges values ('SEK','PLN',0.4832);
insert into exchanges values ('SEK','SGD',0.1957);
insert into exchanges values ('SEK','ZAR',1.5474);
insert into exchanges values ('SEK','EUR',0.11359);
insert into exchanges values ('PLN','USD',0.3233);
insert into exchanges values ('PLN','GBP',0.2034);
insert into exchanges values ('PLN','JPY',31.4348);
insert into exchanges values ('PLN','CHF',0.2921);
insert into exchanges values ('PLN','ARS',1.8937);
insert into exchanges values ('PLN','AUD',0.3421);
insert into exchanges values ('PLN','BRL',0.7099);
insert into exchanges values ('PLN','CAD',0.3336);
insert into exchanges values ('PLN','CNY',1.9786);
insert into exchanges values ('PLN','CZK',6.0962);
insert into exchanges values ('PLN','DKK',1.7694);
insert into exchanges values ('PLN','HKD',2.4997);
insert into exchanges values ('PLN','HUF',71.3013);
insert into exchanges values ('PLN','MXN',4.2567);
insert into exchanges values ('PLN','NOK',1.9312);
insert into exchanges values ('PLN','NZD',0.3919);
insert into exchanges values ('PLN','SEK',2.0693);
insert into exchanges values ('PLN','SGD',0.4049);
insert into exchanges values ('PLN','ZAR',3.202);
insert into exchanges values ('PLN','EUR',0.23987);
insert into exchanges values ('NZD','USD',0.825);
insert into exchanges values ('NZD','GBP',0.5191);
insert into exchanges values ('NZD','JPY',80.2094);
insert into exchanges values ('NZD','CHF',0.7453);
insert into exchanges values ('NZD','ARS',4.8321);
insert into exchanges values ('NZD','AUD',0.8728);
insert into exchanges values ('NZD','BRL',1.8114);
insert into exchanges values ('NZD','CAD',0.8512);
insert into exchanges values ('NZD','CNY',5.0486);
insert into exchanges values ('NZD','CZK',15.5552);
insert into exchanges values ('NZD','DKK',4.5148);
insert into exchanges values ('NZD','HKD',6.3784);
insert into exchanges values ('NZD','HUF',181.9336);
insert into exchanges values ('NZD','MXN',10.8614);
insert into exchanges values ('NZD','NOK',4.9277);
insert into exchanges values ('NZD','PLN',2.5516);
insert into exchanges values ('NZD','SEK',5.2801);
insert into exchanges values ('NZD','SGD',1.0331);
insert into exchanges values ('NZD','ZAR',8.1703);
insert into exchanges values ('NZD','EUR',0.61095);
insert into exchanges values ('NOK','USD',0.1674);
insert into exchanges values ('NOK','GBP',0.1053);
insert into exchanges values ('NOK','JPY',16.2772);
insert into exchanges values ('NOK','CHF',0.1513);
insert into exchanges values ('NOK','ARS',0.9806);
insert into exchanges values ('NOK','AUD',0.1771);
insert into exchanges values ('NOK','BRL',0.3676);
insert into exchanges values ('NOK','CAD',0.1727);
insert into exchanges values ('NOK','CNY',1.0245);
insert into exchanges values ('NOK','CZK',3.1567);
insert into exchanges values ('NOK','DKK',0.9162);
insert into exchanges values ('NOK','HKD',1.2944);
insert into exchanges values ('NOK','HUF',36.9204);
insert into exchanges values ('NOK','MXN',2.2041);
insert into exchanges values ('NOK','NZD',0.2029);
insert into exchanges values ('NOK','PLN',0.5178);
insert into exchanges values ('NOK','SEK',1.0715);
insert into exchanges values ('NOK','SGD',0.2096);
insert into exchanges values ('NOK','ZAR',1.658);
insert into exchanges values ('NOK','EUR',0.11895);
insert into exchanges values ('MXN','USD',0.076);
insert into exchanges values ('MXN','GBP',0.0478);
insert into exchanges values ('MXN','JPY',7.3848);
insert into exchanges values ('MXN','CHF',0.0686);
insert into exchanges values ('MXN','ARS',0.4449);
insert into exchanges values ('MXN','AUD',0.0804);
insert into exchanges values ('MXN','BRL',0.1668);
insert into exchanges values ('MXN','CAD',0.0784);
insert into exchanges values ('MXN','CNY',0.4648);
insert into exchanges values ('MXN','CZK',1.4322);
insert into exchanges values ('MXN','DKK',0.4157);
insert into exchanges values ('MXN','HKD',0.5872);
insert into exchanges values ('MXN','HUF',16.7504);
insert into exchanges values ('MXN','NOK',0.4537);
insert into exchanges values ('MXN','NZD',0.0921);
insert into exchanges values ('MXN','PLN',0.2349);
insert into exchanges values ('MXN','SEK',0.4861);
insert into exchanges values ('MXN','SGD',0.0951);
insert into exchanges values ('MXN','ZAR',0.7522);
insert into exchanges values ('MXN','EUR',0.05527);
insert into exchanges values ('HUF','USD',0.0045);
insert into exchanges values ('HUF','GBP',0.0029);
insert into exchanges values ('HUF','JPY',0.4409);
insert into exchanges values ('HUF','CHF',0.0041);
insert into exchanges values ('HUF','ARS',0.0266);
insert into exchanges values ('HUF','AUD',0.0048);
insert into exchanges values ('HUF','BRL',0.01);
insert into exchanges values ('HUF','CAD',0.0047);
insert into exchanges values ('HUF','CNY',0.0277);
insert into exchanges values ('HUF','CZK',0.0855);
insert into exchanges values ('HUF','DKK',0.0248);
insert into exchanges values ('HUF','HKD',0.0351);
insert into exchanges values ('HUF','MXN',0.0597);
insert into exchanges values ('HUF','NOK',0.0271);
insert into exchanges values ('HUF','NZD',0.0055);
insert into exchanges values ('HUF','PLN',0.014);
insert into exchanges values ('HUF','SEK',0.029);
insert into exchanges values ('HUF','SGD',0.0057);
insert into exchanges values ('HUF','ZAR',0.0449);
insert into exchanges values ('HUF','EUR',0.00333);
insert into exchanges values ('HKD','USD',0.1293);
insert into exchanges values ('HKD','GBP',0.0814);
insert into exchanges values ('HKD','JPY',12.5752);
insert into exchanges values ('HKD','CHF',0.1169);
insert into exchanges values ('HKD','ARS',0.7576);
insert into exchanges values ('HKD','AUD',0.1368);
insert into exchanges values ('HKD','BRL',0.284);
insert into exchanges values ('HKD','CAD',0.1335);
insert into exchanges values ('HKD','CNY',0.7915);
insert into exchanges values ('HKD','CZK',2.4387);
insert into exchanges values ('HKD','DKK',0.7078);
insert into exchanges values ('HKD','HUF',28.5235);
insert into exchanges values ('HKD','MXN',1.7029);
insert into exchanges values ('HKD','NOK',0.7726);
insert into exchanges values ('HKD','NZD',0.1568);
insert into exchanges values ('HKD','PLN',0.4);
insert into exchanges values ('HKD','SEK',0.8278);
insert into exchanges values ('HKD','SGD',0.162);
insert into exchanges values ('HKD','ZAR',1.2809);
insert into exchanges values ('HKD','EUR',0.09463);
insert into exchanges values ('DKK','USD',0.1827);
insert into exchanges values ('DKK','GBP',0.115);
insert into exchanges values ('DKK','JPY',17.7658);
insert into exchanges values ('DKK','CHF',0.1651);
insert into exchanges values ('DKK','ARS',1.0703);
insert into exchanges values ('DKK','AUD',0.1933);
insert into exchanges values ('DKK','BRL',0.4012);
insert into exchanges values ('DKK','CAD',0.1885);
insert into exchanges values ('DKK','CNY',1.1182);
insert into exchanges values ('DKK','CZK',3.4454);
insert into exchanges values ('DKK','HKD',1.4128);
insert into exchanges values ('DKK','HUF',40.2971);
insert into exchanges values ('DKK','MXN',2.4057);
insert into exchanges values ('DKK','NOK',1.0915);
insert into exchanges values ('DKK','NZD',0.2215);
insert into exchanges values ('DKK','PLN',0.5652);
insert into exchanges values ('DKK','SEK',1.1695);
insert into exchanges values ('DKK','SGD',0.2288);
insert into exchanges values ('DKK','ZAR',1.8097);
insert into exchanges values ('DKK','EUR',0.13404);
insert into exchanges values ('CZK','USD',0.053);
insert into exchanges values ('CZK','GBP',0.0334);
insert into exchanges values ('CZK','JPY',5.1564);
insert into exchanges values ('CZK','CHF',0.0479);
insert into exchanges values ('CZK','ARS',0.3106);
insert into exchanges values ('CZK','AUD',0.0561);
insert into exchanges values ('CZK','BRL',0.1164);
insert into exchanges values ('CZK','CAD',0.0547);
insert into exchanges values ('CZK','CNY',0.3246);
insert into exchanges values ('CZK','DKK',0.2902);
insert into exchanges values ('CZK','HKD',0.41);
insert into exchanges values ('CZK','HUF',11.696);
insert into exchanges values ('CZK','MXN',0.6983);
insert into exchanges values ('CZK','NOK',0.3168);
insert into exchanges values ('CZK','NZD',0.0643);
insert into exchanges values ('CZK','PLN',0.164);
insert into exchanges values ('CZK','SEK',0.3394);
insert into exchanges values ('CZK','SGD',0.0664);
insert into exchanges values ('CZK','ZAR',0.5252);
insert into exchanges values ('CZK','EUR',0.03639);
insert into exchanges values ('CNY','USD',0.1634);
insert into exchanges values ('CNY','GBP',0.1028);
insert into exchanges values ('CNY','JPY',15.8876);
insert into exchanges values ('CNY','CHF',0.1476);
insert into exchanges values ('CNY','ARS',0.9571);
insert into exchanges values ('CNY','AUD',0.1729);
insert into exchanges values ('CNY','BRL',0.3588);
insert into exchanges values ('CNY','CAD',0.1686);
insert into exchanges values ('CNY','CZK',3.0811);
insert into exchanges values ('CNY','DKK',0.8943);
insert into exchanges values ('CNY','HKD',1.2634);
insert into exchanges values ('CNY','HUF',36.0367);
insert into exchanges values ('CNY','MXN',2.1514);
insert into exchanges values ('CNY','NOK',0.9761);
insert into exchanges values ('CNY','NZD',0.1981);
insert into exchanges values ('CNY','PLN',0.5054);
insert into exchanges values ('CNY','SEK',1.0459);
insert into exchanges values ('CNY','SGD',0.2046);
insert into exchanges values ('CNY','ZAR',1.6183);
insert into exchanges values ('CNY','EUR',0.1211);
insert into exchanges values ('CAD','USD',0.9691);
insert into exchanges values ('CAD','GBP',0.6098);
insert into exchanges values ('CAD','JPY',94.2255);
insert into exchanges values ('CAD','CHF',0.8756);
insert into exchanges values ('CAD','ARS',5.6764);
insert into exchanges values ('CAD','AUD',1.0253);
insert into exchanges values ('CAD','BRL',2.1279);
insert into exchanges values ('CAD','CNY',5.9308);
insert into exchanges values ('CAD','CZK',18.2734);
insert into exchanges values ('CAD','DKK',5.3037);
insert into exchanges values ('CAD','HKD',7.4929);
insert into exchanges values ('CAD','HUF',213.7254);
insert into exchanges values ('CAD','MXN',12.7594);
insert into exchanges values ('CAD','NOK',5.7888);
insert into exchanges values ('CAD','NZD',1.1747);
insert into exchanges values ('CAD','PLN',2.9975);
insert into exchanges values ('CAD','SEK',6.2028);
insert into exchanges values ('CAD','SGD',1.2136);
insert into exchanges values ('CAD','ZAR',9.598);
insert into exchanges values ('CAD','EUR',0.67204);
insert into exchanges values ('BRL','USD',0.4554);
insert into exchanges values ('BRL','GBP',0.2866);
insert into exchanges values ('BRL','JPY',44.2804);
insert into exchanges values ('BRL','CHF',0.4115);
insert into exchanges values ('BRL','ARS',2.6676);
insert into exchanges values ('BRL','AUD',0.4819);
insert into exchanges values ('BRL','CAD',0.4699);
insert into exchanges values ('BRL','CNY',2.7871);
insert into exchanges values ('BRL','CZK',8.5874);
insert into exchanges values ('BRL','DKK',2.4924);
insert into exchanges values ('BRL','HKD',3.5212);
insert into exchanges values ('BRL','HUF',100.4384);
insert into exchanges values ('BRL','MXN',5.9962);
insert into exchanges values ('BRL','NOK',2.7204);
insert into exchanges values ('BRL','NZD',0.5521);
insert into exchanges values ('BRL','PLN',1.4086);
insert into exchanges values ('BRL','SEK',2.915);
insert into exchanges values ('BRL','SGD',0.5703);
insert into exchanges values ('BRL','ZAR',4.5105);
insert into exchanges values ('BRL','EUR',0.31058);
insert into exchanges values ('AUD','USD',0.9452);
insert into exchanges values ('AUD','GBP',0.5947);
insert into exchanges values ('AUD','JPY',91.8967);
insert into exchanges values ('AUD','CHF',0.8539);
insert into exchanges values ('AUD','ARS',5.5361);
insert into exchanges values ('AUD','BRL',2.0753);
insert into exchanges values ('AUD','CAD',0.9753);
insert into exchanges values ('AUD','CNY',5.7842);
insert into exchanges values ('AUD','CZK',17.8218);
insert into exchanges values ('AUD','DKK',5.1727);
insert into exchanges values ('AUD','HKD',7.3078);
insert into exchanges values ('AUD','HUF',208.4431);
insert into exchanges values ('AUD','MXN',12.444);
insert into exchanges values ('AUD','NOK',5.6457);
insert into exchanges values ('AUD','NZD',1.1457);
insert into exchanges values ('AUD','PLN',2.9234);
insert into exchanges values ('AUD','SEK',6.0495);
insert into exchanges values ('AUD','SGD',1.1836);
insert into exchanges values ('AUD','ZAR',9.3608);
insert into exchanges values ('AUD','EUR',0.64641);
insert into exchanges values ('ARS','USD',0.1707);
insert into exchanges values ('ARS','GBP',0.1074);
insert into exchanges values ('ARS','JPY',16.5994);
insert into exchanges values ('ARS','CHF',0.1542);
insert into exchanges values ('ARS','AUD',0.1806);
insert into exchanges values ('ARS','BRL',0.3749);
insert into exchanges values ('ARS','CAD',0.1762);
insert into exchanges values ('ARS','CNY',1.0448);
insert into exchanges values ('ARS','CZK',3.2192);
insert into exchanges values ('ARS','DKK',0.9343);
insert into exchanges values ('ARS','HKD',1.32);
insert into exchanges values ('ARS','HUF',37.6514);
insert into exchanges values ('ARS','MXN',2.2478);
insert into exchanges values ('ARS','NOK',1.0198);
insert into exchanges values ('ARS','NZD',0.207);
insert into exchanges values ('ARS','PLN',0.5281);
insert into exchanges values ('ARS','SEK',1.0927);
insert into exchanges values ('ARS','SGD',0.2138);
insert into exchanges values ('ARS','ZAR',1.6909);
insert into exchanges values ('ARS','EUR',0.10824);
insert into exchanges values ('CHF','USD',1.1069);
insert into exchanges values ('CHF','GBP',0.6964);
insert into exchanges values ('CHF','JPY',107.6147);
insert into exchanges values ('CHF','ARS',6.483);
insert into exchanges values ('CHF','AUD',1.171);
insert into exchanges values ('CHF','BRL',2.4303);
insert into exchanges values ('CHF','CAD',1.1421);
insert into exchanges values ('CHF','CNY',6.7735);
insert into exchanges values ('CHF','CZK',20.87);
insert into exchanges values ('CHF','DKK',6.0574);
insert into exchanges values ('CHF','HKD',8.5577);
insert into exchanges values ('CHF','HUF',244.0953);
insert into exchanges values ('CHF','MXN',14.5725);
insert into exchanges values ('CHF','NOK',6.6114);
insert into exchanges values ('CHF','NZD',1.3417);
insert into exchanges values ('CHF','PLN',3.4234);
insert into exchanges values ('CHF','SEK',7.0842);
insert into exchanges values ('CHF','SGD',1.3861);
insert into exchanges values ('CHF','ZAR',10.9619);
insert into exchanges values ('CHF','EUR',0.81103);
insert into exchanges values ('JPY','USD',0.0103);
insert into exchanges values ('JPY','GBP',0.0065);
insert into exchanges values ('JPY','CHF',0.0093);
insert into exchanges values ('JPY','ARS',0.0602);
insert into exchanges values ('JPY','AUD',0.0109);
insert into exchanges values ('JPY','BRL',0.0226);
insert into exchanges values ('JPY','CAD',0.0106);
insert into exchanges values ('JPY','CNY',0.0629);
insert into exchanges values ('JPY','CZK',0.1939);
insert into exchanges values ('JPY','DKK',0.0563);
insert into exchanges values ('JPY','HKD',0.0795);
insert into exchanges values ('JPY','HUF',2.2682);
insert into exchanges values ('JPY','MXN',0.1354);
insert into exchanges values ('JPY','NOK',0.0614);
insert into exchanges values ('JPY','NZD',0.0125);
insert into exchanges values ('JPY','PLN',0.0318);
insert into exchanges values ('JPY','SEK',0.0658);
insert into exchanges values ('JPY','SGD',0.0129);
insert into exchanges values ('JPY','ZAR',0.1019);
insert into exchanges values ('JPY','EUR',0.00704);
insert into exchanges values ('GBP','USD',1.5893);
insert into exchanges values ('GBP','JPY',154.5241);
insert into exchanges values ('GBP','CHF',1.4359);
insert into exchanges values ('GBP','ARS',9.309);
insert into exchanges values ('GBP','AUD',1.6815);
insert into exchanges values ('GBP','BRL',3.4897);
insert into exchanges values ('GBP','CAD',1.6399);
insert into exchanges values ('GBP','CNY',9.7261);
insert into exchanges values ('GBP','CZK',29.9672);
insert into exchanges values ('GBP','DKK',8.6978);
insert into exchanges values ('GBP','HKD',12.288);
insert into exchanges values ('GBP','HUF',350.4966);
insert into exchanges values ('GBP','MXN',20.9246);
insert into exchanges values ('GBP','NOK',9.4933);
insert into exchanges values ('GBP','NZD',1.9265);
insert into exchanges values ('GBP','PLN',4.9157);
insert into exchanges values ('GBP','SEK',10.1722);
insert into exchanges values ('GBP','SGD',1.9903);
insert into exchanges values ('GBP','ZAR',15.7402);
insert into exchanges values ('GBP','EUR',1.1999);
insert into exchanges values ('USD','GBP',0.6292);
insert into exchanges values ('USD','JPY',97.2253);
insert into exchanges values ('USD','CHF',0.9035);
insert into exchanges values ('USD','ARS',5.8571);
insert into exchanges values ('USD','AUD',1.058);
insert into exchanges values ('USD','BRL',2.1957);
insert into exchanges values ('USD','CAD',1.0318);
insert into exchanges values ('USD','CNY',6.1196);
insert into exchanges values ('USD','CZK',18.8551);
insert into exchanges values ('USD','DKK',5.4726);
insert into exchanges values ('USD','HKD',7.7315);
insert into exchanges values ('USD','HUF',220.5296);
insert into exchanges values ('USD','MXN',13.1656);
insert into exchanges values ('USD','NOK',5.9731);
insert into exchanges values ('USD','NZD',1.2121);
insert into exchanges values ('USD','PLN',3.0929);
insert into exchanges values ('USD','SEK',6.4003);
insert into exchanges values ('USD','SGD',1.2523);
insert into exchanges values ('USD','ZAR',9.9036);
insert into exchanges values ('USD','EUR',0.73335);
insert into exchanges values ('EUR','USD',1.3538);
insert into exchanges values ('EUR','GBP',0.8518);
insert into exchanges values ('EUR','JPY',131.6236);
insert into exchanges values ('EUR','CHF',1.2231);
insert into exchanges values ('EUR','ARS',7.9294);
insert into exchanges values ('EUR','AUD',1.4323);
insert into exchanges values ('EUR','BRL',2.9725);
insert into exchanges values ('EUR','CAD',1.3969);
insert into exchanges values ('EUR','CNY',8.2847);
insert into exchanges values ('EUR','CZK',25.5261);
insert into exchanges values ('EUR','DKK',7.4088);
insert into exchanges values ('EUR','HKD',10.4669);
insert into exchanges values ('EUR','HUF',298.553);
insert into exchanges values ('EUR','MXN',17.8236);
insert into exchanges values ('EUR','NOK',8.0864);
insert into exchanges values ('EUR','NZD',1.641);
insert into exchanges values ('EUR','PLN',4.1872);
insert into exchanges values ('EUR','SEK',8.6647);
insert into exchanges values ('EUR','SGD',1.6953);
insert into exchanges values ('EUR','ZAR',13.4075);