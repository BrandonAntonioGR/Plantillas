SELECT
a.Agente as AGENTE----interno
,a.TEL AS TELEFONO--api
,a.CONTRATO AS CONTRATO
,Convert(int,a.DPD) AS DPD
,a.Adeudo AS ADEUDO
 ,a.NOMBRE AS NOMBRE
 --,a.NCOMPLETO AS NCOMPLETO
--,ll.correo AS CORREO
,a.SPEI_CLABE AS SPEI
,a.OXXOReference AS OXXO
--,a.Client_Type AS TIPOCLIENTE
--,a.PROMESAS AS PROMESAS
--,a.DIAS_CCC AS DIASCCC
--,a.DIAS_MIT AS DIASMIT
--,a.DIAS_MESSB AS DIASMSB
,a.ALGORITMO AS ALGORITMO
 FROM DC_HIS_ASIG a
LEFT JOIN dm_LLAVES ll
ON ll.contract_id=a.CONTRATO
LEFT JOIN dm_REF_GPT1 AS r 
ON r.number=a.CONTRATO
WHERE Agente='MARIANA' AND CONVERT(DATE,[Creation_Day])=CONVERT(DATE,GETDATE())
and a.DPD = 2
ORDER BY a.DPD


