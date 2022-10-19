INSERT INTO EMPLEADO(id, nombre, id_role, activo) VALUES(1, 'Javier Perez', 1, 1);
INSERT INTO EMPLEADO(id, nombre, id_role, activo) VALUES(2, 'Saul', 2, 1);
INSERT INTO EMPLEADO(id, nombre, id_role, activo) VALUES(3, 'Daniel', 3, 1);
INSERT INTO EMPLEADO(id, nombre, id_role, activo) VALUES(4, 'Francisco', 1, 1);
INSERT INTO EMPLEADO(id, nombre, id_role, activo) VALUES(5, 'Roberto', 1, 1);

INSERT INTO ROLE(id, nombre ,bono_hora,sueldo_base) VALUES(1, 'Choferes', 10.0,30.0);
INSERT INTO ROLE(id, nombre ,bono_hora,sueldo_base) VALUES(2, 'Cargadores', 5.0,30.0);
INSERT INTO ROLE(id, nombre ,bono_hora,sueldo_base) VALUES(3, 'Auxiliares', 0.0,30.0);


INSERT INTO SUELDO_EMPLEADO(id, id_empleado, monto_bono,monto_neto,isr_normal,isr_excedente,monto_bruto,monto_vales,mes,anio)VALUES(1,1, 3.0,5.0,100.0,120.0,50.0,80.0,10,2022);
INSERT INTO SUELDO_EMPLEADO(id, id_empleado, monto_bono,monto_neto,isr_normal,isr_excedente,monto_bruto,monto_vales,mes,anio)VALUES(2,2, 3.0,5.0,100.0,120.0,50.0,80.0,10,2022);

INSERT INTO ENTREGAS(id, id_empleado, nombre,id_role,mes,dia,anio,cantidad_entregas,es_por_mes)VALUES(1,1,'Test entrega diaria',1,9,0,2022,1,1);
INSERT INTO ENTREGAS(id, id_empleado, nombre,id_role,mes,dia,anio,cantidad_entregas,es_por_mes)VALUES(2,1,'Test entrega diaria',1,10,3,2022,1,0);
INSERT INTO ENTREGAS(id, id_empleado, nombre,id_role,mes,dia,anio,cantidad_entregas,es_por_mes)VALUES(3,1,'Test entrega diaria',2,10,4,2022,1,1);
INSERT INTO ENTREGAS(id, id_empleado, nombre,id_role,mes,dia,anio,cantidad_entregas,es_por_mes)VALUES(4,1,'Test entrega diaria',1,10,5,2022,1,0);
INSERT INTO ENTREGAS(id, id_empleado, nombre,id_role,mes,dia,anio,cantidad_entregas,es_por_mes)VALUES(5,3,'Test entrega diaria',3,7,0,2022,5,1);
INSERT INTO ENTREGAS(id, id_empleado, nombre,id_role,mes,dia,anio,cantidad_entregas,es_por_mes)VALUES(6,4,'Test entrega diaria',2,7,0,2022,4,0);
INSERT INTO ENTREGAS(id, id_empleado, nombre,id_role,mes,dia,anio,cantidad_entregas,es_por_mes)VALUES(7,5,'Test entrega diaria',1,8,0,2022,2,1);

INSERT INTO sueldos_config(id, dias_laborales, isr,isr_excendente,monto_entrega,porcentaje_vales,semanas_por_mes, hrs_laborables,sueldo_tope_isr_adicional)VALUES(1,6,0.09,0.03,5,0.04,4,8,10000.0);

