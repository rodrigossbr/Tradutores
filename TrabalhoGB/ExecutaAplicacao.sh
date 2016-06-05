echo -e "\nGerando analisador com antlr par a pasta src/tradutorCsharp";
antlr4 -no-listener -visitor -package tradutorCsharp -o src/tradutorCsharp Csharp.g4;



echo -e "\nCompilando os codigos java para a pasta bin/";
javac -d bin/ src/tradutorCsharp/*.java;



echo -e "\nExecutando a aplicacao com o input: input-csharp/User.cs "
cd bin/;
#java -verbose tradutorCsharp.ExecutaTradutor ../input-csharp/User.cs;
java tradutorCsharp.ExecutaTradutor ../input-csharp/User.cs;

echo -e "\nExecutou tranquilo!"
