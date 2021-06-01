/*
 * generated by Xtext 2.26.0-SNAPSHOT
 */
grammar DebugInternalAsmetaL;

// Rule Asm
ruleAsm:
	(
		'asyncr'
		?
		(
			'asm'
			    |
			'module'
		)
		(
			ruleextendedNameForAsm
			    |RULE_STRING
		)
		ruleHeader
		ruleBody
		(
			'main'
			ruleMacroDeclaration
		)?
		(
			ruleInitialization
			*
			'default'
			ruleInitialization
			ruleInitialization
			*
		)?
	)?
;

// Rule Header
ruleHeader:
	ruleImportClause
	*
	ruleExportClause
	?
	ruleSignature
;

// Rule ImportClause
ruleImportClause:
	'import'
	(
		ruleMOD_ID
		    |RULE_STRING
	)
	(
		'('
		ruleimportData
		(
			','
			ruleimportData
		)*
		')'
	)?
;

// Rule importData
ruleimportData:
	ruleextendedName
;

// Rule ExportClause
ruleExportClause:
	'export'
	(
		ruleextendedName
		(
			','
			ruleextendedName
		)*
		    |
		'*'
	)
;

// Rule Signature
ruleSignature:
	'signature'
	':'
	ruleDomain
	*
	ruleFunction
	*
;

// Rule Initialization
ruleInitialization:
	'init'
	ruleextendedName
	':'
	ruleDomainInitialization
	*
	ruleFunctionInitialization
	*
	ruleAgentInitialization
	*
;

// Rule DomainInitialization
ruleDomainInitialization:
	'domain'
	RULE_ID
	'='
	ruleTerm
;

// Rule FunctionInitialization
ruleFunctionInitialization:
	'function'
	ruleextendedNameForFunction
	(
		'('
		ruleID_VARIABLE
		'in'
		rulegetDomainByID
		(
			','
			ruleID_VARIABLE
			'in'
			rulegetDomainByID
		)*
		')'
	)?
	'='
	ruleTerm
;

// Rule AgentInitialization
ruleAgentInitialization:
	'agent'
	(
		RULE_ID
		    |'Agent'
	)
	':'
	ruleMacroCallRule
;

// Rule Body
ruleBody:
	'definitions'
	':'
	ruleDomainDefinition
	*
	ruleFunctionDefinition
	*
	ruleRuleDeclaration
	*
	ruleInvariantConstraint
	*
	ruleFairnessConstraint
	*
	ruleProperty
	*
;

// Rule DomainDefinition
ruleDomainDefinition:
	'domain'
	RULE_ID
	'='
	ruleTerm
;

// Rule FunctionDefinition
ruleFunctionDefinition:
	'function'
	RULE_ID
	(
		'('
		ruleID_VARIABLE
		'in'
		rulegetDomainByID
		(
			','
			ruleID_VARIABLE
			'in'
			rulegetDomainByID
		)*
		')'
	)?
	'='
	ruleTerm
;

// Rule RuleDeclaration
ruleRuleDeclaration:
	(
		ruleMacroDeclaration
		    |
		ruleTurboDeclaration
	)
;

// Rule MacroDeclaration
ruleMacroDeclaration:
	'macro'?
	'rule'
	RULE_RULE_ID
	(
		'('
		ruleID_VARIABLE
		'in'
		rulegetDomainByID
		(
			','
			ruleID_VARIABLE
			'in'
			rulegetDomainByID
		)*
		')'
	)?
	(
		'in'
		rulegetDomainByID
	)?
	'='
	ruleRule
;

// Rule TurboDeclaration
ruleTurboDeclaration:
	'turbo'
	'rule'
	RULE_RULE_ID
	(
		'('
		ruleID_VARIABLE
		'in'
		rulegetDomainByID
		(
			','
			ruleID_VARIABLE
			'in'
			rulegetDomainByID
		)*
		')'
	)?
	(
		'in'
		rulegetDomainByID
	)?
	'='
	ruleRule
;

// Rule Property
ruleProperty:
	(
		ruleInvariant
		    |
		ruleTemporalProperty
	)
;

// Rule TemporalProperty
ruleTemporalProperty:
	(
		ruleCtlSpec
		    |
		ruleLtlSpec
	)
;

// Rule Invariant
ruleInvariant:
	'invariant'
	RULE_ID
	?
	'over'
	ruleInvariantElement
	(
		','
		ruleInvariantElement
	)*
	':'
	ruleTerm
;

// Rule InvariantElement
ruleInvariantElement:
	RULE_ID
	(
		'('
		rulegetDomainByID
		?
		')'
	)?
;

// Rule CtlSpec
ruleCtlSpec:
	(
		'CTL'
		    |
		'CTLSPEC'
	)
	(
		RULE_ID
		':'
	)?
	ruleTerm
;

// Rule LtlSpec
ruleLtlSpec:
	(
		'LTL'
		    |
		'LTLSPEC'
	)
	(
		RULE_ID
		':'
	)?
	ruleTerm
;

// Rule FairnessConstraint
ruleFairnessConstraint:
	(
		ruleJusticeConstraint
		    |
		ruleCompassionConstraint
	)
;

// Rule JusticeConstraint
ruleJusticeConstraint:
	'JUSTICE'
	ruleTerm
;

// Rule CompassionConstraint
ruleCompassionConstraint:
	'COMPASSION'
	'('
	ruleTerm
	','
	ruleTerm
	')'
;

// Rule InvariantConstraint
ruleInvariantConstraint:
	'INVAR'
	ruleTerm
;

// Rule Domain
ruleDomain:
	(
		ruleConcreteDomain
		    |
		ruleTypeDomain
	)
;

// Rule ConcreteDomain
ruleConcreteDomain:
	'dynamic'
	?
	'domain'
	RULE_ID
	'subsetof'
	rulegetDomainByID
;

// Rule TypeDomain
ruleTypeDomain:
	(
		ruleAnyDomain
		    |
		ruleStructuredTD
		    |
		ruleEnumTD
		    |
		ruleAbstractTD
		    |
		ruleBasicTD
	)
;

// Rule AnyDomain
ruleAnyDomain:
	'anydomain'
	RULE_ID
;

// Rule BasicTD
ruleBasicTD:
	'basic'
	'domain'
	(
		RULE_ID
		    |
		ruleStandardDomain
	)
;

// Rule StandardDomain
ruleStandardDomain:
	(
		ruleIntegerDomain
		    |
		ruleRealDomain
		    |
		ruleStringDomain
		    |
		ruleNaturalDomain
		    |
		ruleCharDomain
		    |
		ruleComplexDomain
		    |
		ruleBooleanDomain
		    |
		ruleUndefDomain
	)
;

// Rule IntegerDomain
ruleIntegerDomain:
	'Integer'
;

// Rule RealDomain
ruleRealDomain:
	'Real'
;

// Rule StringDomain
ruleStringDomain:
	'String'
;

// Rule NaturalDomain
ruleNaturalDomain:
	'Natural'
;

// Rule CharDomain
ruleCharDomain:
	'Char'
;

// Rule ComplexDomain
ruleComplexDomain:
	'Complex'
;

// Rule BooleanDomain
ruleBooleanDomain:
	'Boolean'
;

// Rule UndefDomain
ruleUndefDomain:
	'Undef'
;

// Rule AbstractTD
ruleAbstractTD:
	(
		ruleGenericAbstractTD
		    |
		ruleAgentDomain
		    |
		ruleReserveDomain
	)
;

// Rule GenericAbstractTD
ruleGenericAbstractTD:
	'dynamic'
	?
	'abstract'
	'domain'
	RULE_ID
;

// Rule AgentDomain
ruleAgentDomain:
	'dynamic'
	?
	'abstract'
	'domain'
	'Agent'
;

// Rule ReserveDomain
ruleReserveDomain:
	'dynamic'
	?
	'abstract'
	'domain'
	'Reserve'
;

// Rule EnumTD
ruleEnumTD:
	'enum'
	'domain'
	RULE_ID
	'='
	'{'
	ruleEnumElement
	(
		(
			'|'
			    |
			','
		)
		ruleEnumElement
	)*
	'}'
;

// Rule EnumElement
ruleEnumElement:
	RULE_ENUM_ID
;

// Rule StructuredTD
ruleStructuredTD:
	(
		ruleRuleDomain
		    |
		ruleProductDomain
		    |
		ruleSequenceDomain
		    |
		rulePowersetDomain
		    |
		ruleBagDomain
		    |
		ruleMapDomain
	)
;

// Rule RuleDomain
ruleRuleDomain:
	'Rule'
	(
		'('
		rulegetDomainByID
		(
			','
			rulegetDomainByID
		)*
		')'
	)?
;

// Rule ProductDomain
ruleProductDomain:
	'Prod'
	'('
	rulegetDomainByID
	(
		','
		rulegetDomainByID
	)+
	')'
;

// Rule SequenceDomain
ruleSequenceDomain:
	'Seq'
	'('
	rulegetDomainByID
	')'
;

// Rule PowersetDomain
rulePowersetDomain:
	'Powerset'
	'('
	rulegetDomainByID
	')'
;

// Rule BagDomain
ruleBagDomain:
	'Bag'
	'('
	rulegetDomainByID
	')'
;

// Rule MapDomain
ruleMapDomain:
	'Map'
	'('
	rulegetDomainByID
	','
	rulegetDomainByID
	')'
;

// Rule getDomainByID
rulegetDomainByID:
	(
		ruleStructuredTD
		    |
		rulenameofDomain
		    |
		ruleStandardDomain
		    |
		ruleAbstractTD
		    |
		'Agent'
		    |
		'Reserve'
	)
;

// Rule Function
ruleFunction:
	(
		ruleBasicFunction
		    |
		ruleDerivedFunction
	)
;

// Rule BasicFunction
ruleBasicFunction:
	(
		ruleStaticFunction
		    |
		ruleDynamicFunction
	)
;

// Rule DerivedFunction
ruleDerivedFunction:
	'derived'
	RULE_ID
	':'
	(
		rulegetDomainByID
		'->'
	)?
	rulegetDomainByID
;

// Rule StaticFunction
ruleStaticFunction:
	'static'
	ruleextendedNameForFunction
	':'
	(
		rulegetDomainByID
		'->'
	)?
	rulegetDomainByID
;

// Rule DynamicFunction
ruleDynamicFunction:
	(
		ruleOutFunction
		    |
		ruleMonitoredFunction
		    |
		ruleSharedFunction
		    |
		ruleControlledFunction
		    |
		ruleLocalFunction
	)
;

// Rule LocalFunction
ruleLocalFunction:
	'dynamic'
	?
	'local'
	ruleextendedName
	':'
	(
		rulegetDomainByID
		'->'
	)?
	rulegetDomainByID
;

// Rule ControlledFunction
ruleControlledFunction:
	'dynamic'
	?
	'controlled'
	ruleextendedName
	':'
	(
		rulegetDomainByID
		'->'
	)?
	rulegetDomainByID
;

// Rule SharedFunction
ruleSharedFunction:
	'dynamic'
	?
	'shared'
	ruleextendedName
	':'
	(
		rulegetDomainByID
		'->'
	)?
	rulegetDomainByID
;

// Rule MonitoredFunction
ruleMonitoredFunction:
	'dynamic'
	?
	'monitored'
	ruleextendedName
	':'
	(
		rulegetDomainByID
		'->'
	)?
	rulegetDomainByID
;

// Rule OutFunction
ruleOutFunction:
	'dynamic'
	?
	'out'
	ruleextendedName
	':'
	(
		rulegetDomainByID
		'->'
	)?
	rulegetDomainByID
;

// Rule extendedNameForFunction
ruleextendedNameForFunction:
	(
		RULE_ID
		    |
		'and'
		    |
		'or'
		    |
		'not'
		    |
		'xor'
		    |
		'mod'
		    |
		'iff'
		    |
		'implies'
	)
;

// Rule extendedNameForAsm
ruleextendedNameForAsm:
	(
		RULE_ID
		    |
		RULE_ENUM_ID
		    |
		'while'
		    |
		'for'
		    |
		'main'
	)
;

// Rule extendedName
ruleextendedName:
	(
		RULE_RULE_ID
		    |
		RULE_ID
		    |
		RULE_ENUM_ID
	)
;

// Rule Term
ruleTerm:
	(
		ruleExpression
		    |
		ruleDomainTerm
		    |
		ruleExtendedTerm
	)
;

// Rule DomainTerm
ruleDomainTerm:
	rulegetDomainByID
;

// Rule Expression
ruleExpression:
	ruleImpliesIffExpression
;

// Rule ImpliesIffExpression
ruleImpliesIffExpression:
	ruleXorOrExpression
	(
		(
			((
				'implies'
				    |
				'iff'
			)
			)=>
			(
				'implies'
				    |
				'iff'
			)
		)
		ruleXorOrExpression
	)*
;

// Rule XorOrExpression
ruleXorOrExpression:
	ruleAndExpression
	(
		(
			((
				'xor'
				    |
				'or'
			)
			)=>
			(
				'xor'
				    |
				'or'
			)
		)
		ruleAndExpression
	)*
;

// Rule AndExpression
ruleAndExpression:
	ruleEqualityExpression
	(
		(
			('and'
			)=>
			'and'
		)
		ruleEqualityExpression
	)*
;

// Rule EqualityExpression
ruleEqualityExpression:
	ruleCompareExpression
	(
		(
			((
				'='
				    |
				'!='
			)
			)=>
			(
				'='
				    |
				'!='
			)
		)
		ruleCompareExpression
	)*
;

// Rule CompareExpression
ruleCompareExpression:
	ruleAdditiveExpression
	(
		(
			((
				'>'
				    |
				'<'
				    |
				'>='
				    |
				'<='
			)
			)=>
			(
				'>'
				    |
				'<'
				    |
				'>='
				    |
				'<='
			)
		)
		ruleAdditiveExpression
	)*
;

// Rule AdditiveExpression
ruleAdditiveExpression:
	ruleMultiplicativeExpression
	(
		(
			((
				'+'
				    |
				'-'
			)
			)=>
			(
				'+'
				    |
				'-'
			)
		)
		ruleMultiplicativeExpression
	)*
;

// Rule MultiplicativeExpression
ruleMultiplicativeExpression:
	rulePowerExpression
	(
		(
			((
				'*'
				    |
				'/'
				    |
				'mod'
			)
			)=>
			(
				'*'
				    |
				'/'
				    |
				'mod'
			)
		)
		rulePowerExpression
	)*
;

// Rule PowerExpression
rulePowerExpression:
	ruleUnaryOperation
	(
		(
			('^'
			)=>
			'^'
		)
		ruleUnaryOperation
	)*
;

// Rule UnaryOperation
ruleUnaryOperation:
	(
		(
			'not'
			    |
			'+'
			    |
			'-'
		)
		ruleUnaryOperation
		    |
		rulebasicExpr
		    |
		ruleParenthesizedExpression
	)
;

// Rule ParenthesizedExpression
ruleParenthesizedExpression:
	'('
	ruleExpression
	')'
;

// Rule basicExpr
rulebasicExpr:
	(
		ruleBasicTerm
		    |
		ruleFiniteQuantificationTerm
	)
;

// Rule BasicTerm
ruleBasicTerm:
	(
		ruleFunctionTerm
		    |
		ruleConstantTerm
		    |
		ruleVariableTerm
		    |
		ruleLocationTerm
	)
;

// Rule FunctionTerm
ruleFunctionTerm:
	(
		ruleextendedName
		'.'
	)?
	ruleextendedNameForFunction
	ruleTupleTerm
	?
;

// Rule LocationTerm
ruleLocationTerm:
	(
		ruleextendedName
		'.'
	)?
	ruleextendedNameForFunction
	ruleTupleTerm
	?
;

// Rule VariableTerm
ruleVariableTerm:
	ruleID_VARIABLE
;

// Rule ConstantTerm
ruleConstantTerm:
	(
		ruleNumberTerm
		    |
		ruleComplexTerm
		    |
		ruleNaturalTerm
		    |
		ruleCharTerm
		    |
		ruleStringTerm
		    |
		ruleBooleanTerm
		    |
		ruleUndefTerm
		    |
		ruleEnumTerm
	)
;

// Rule NumberTerm
ruleNumberTerm:
	(
		ruleIntegerTerm
		    |
		ruleRealTerm
	)
;

// Rule BooleanTerm
ruleBooleanTerm:
	(
		'true'
		    |
		'false'
	)
;

// Rule UndefTerm
ruleUndefTerm:
	'undef'
;

// Rule ComplexTerm
ruleComplexTerm:
	RULE_COMPLEX_NUMBER
;

// Rule NaturalTerm
ruleNaturalTerm:
	RULE_NATNUMBER
;

// Rule CharTerm
ruleCharTerm:
	RULE_CHAR_LITERAL
;

// Rule StringTerm
ruleStringTerm:
	RULE_STRING_LITERAL
;

// Rule EnumTerm
ruleEnumTerm:
	RULE_ENUM_ID
;

// Rule RealTerm
ruleRealTerm:
	ruleRealNumberWithSign
;

// Rule IntegerTerm
ruleIntegerTerm:
	(
		RULE_NUMBER_TOKEN
		    |ruleNumberWithSign
	)
;

// Rule RealNumberWithSign
ruleRealNumberWithSign:
	(
		'+'
		    |
		'-'
	)?
	RULE_REAL_NUMBER
;

// Rule NumberWithSign
ruleNumberWithSign:
	(
		'+'
		    |
		'-'
	)?
	RULE_NUMBER_TOKEN
;

// Rule ExtendedTerm
ruleExtendedTerm:
	(
		ruleConditionalTerm
		    |
		ruleCaseTerm
		    |
		ruleTupleTerm
		    |
		ruleVariableBindingTerm
		    |
		ruleCollectionTerm
		    |
		ruleRuleAsTerm
	)
;

// Rule ConditionalTerm
ruleConditionalTerm:
	'if'
	ruleTerm
	'then'
	ruleTerm
	(
		'else'
		ruleTerm
	)?
	'endif'
;

// Rule CaseTerm
ruleCaseTerm:
	'switch'
	ruleTerm
	(
		'case'
		ruleTerm
		':'
		ruleTerm
	)+
	(
		'otherwise'
		ruleTerm
	)?
	'endswitch'
;

// Rule TupleTerm
ruleTupleTerm:
	'('
	ruleTerm
	(
		','
		ruleTerm
	)*
	')'
;

// Rule CollectionTerm
ruleCollectionTerm:
	(
		ruleSequenceTerm
		    |
		ruleMapTerm
		    |
		ruleSetTerm
		    |
		ruleBagTerm
	)
;

// Rule SequenceTerm
ruleSequenceTerm:
	'['
	(
		ruleTerm
		(
			(
				','
				ruleTerm
			)+
			    |
			(
				(':')=>
				':'
			)
			ruleTerm
			(
				','
				ruleConstantTerm
			)?
		)?
	)?
	']'
;

// Rule MapTerm
ruleMapTerm:
	'{'
	(
		'->'
		    |
		ruleTerm
		'->'
		ruleTerm
		(
			','
			ruleTerm
			'->'
			ruleTerm
		)*
	)
	'}'
;

// Rule SetTerm
ruleSetTerm:
	'{'
	(
		ruleTerm
		(
			(
				','
				ruleTerm
			)+
			    |
			(
				(':')=>
				':'
			)
			ruleTerm
			(
				','
				ruleConstantTerm
			)?
		)?
	)?
	'}'
;

// Rule BagTerm
ruleBagTerm:
	'<'
	(
		ruleBasicTerm
		(
			(
				','
				ruleBasicTerm
			)+
			    |
			(
				(':')=>
				':'
			)
			ruleConstantTerm
			(
				','
				ruleConstantTerm
			)?
		)?
	)?
	'>'
;

// Rule VariableBindingTerm
ruleVariableBindingTerm:
	(
		ruleLetTerm
		    |
		ruleFiniteQuantificationTerm
		    |
		ruleComprehensionTerm
	)
;

// Rule FiniteQuantificationTerm
ruleFiniteQuantificationTerm:
	(
		ruleForallTerm
		    |
		ruleExistUniqueTerm
		    |
		ruleExistTerm
	)
;

// Rule ExistUniqueTerm
ruleExistUniqueTerm:
	'('
	'exist'
	'unique'
	ruleVariableTerm
	'in'
	ruleTerm
	(
		','
		ruleVariableTerm
		'in'
		ruleTerm
	)*
	(
		'with'
		ruleTerm
	)?
	')'
;

// Rule ExistTerm
ruleExistTerm:
	'('
	'exist'
	ruleVariableTerm
	'in'
	ruleTerm
	(
		','
		ruleVariableTerm
		'in'
		ruleTerm
	)*
	(
		'with'
		ruleTerm
	)?
	')'
;

// Rule ForallTerm
ruleForallTerm:
	'('
	'forall'
	ruleVariableTerm
	'in'
	ruleTerm
	(
		','
		ruleVariableTerm
		'in'
		ruleTerm
	)*
	(
		'with'
		ruleTerm
	)?
	')'
;

// Rule LetTerm
ruleLetTerm:
	'let'
	'('
	ruleVariableTerm
	'='
	ruleTerm
	(
		','
		ruleVariableTerm
		'='
		ruleTerm
	)*
	')'
	'in'
	ruleTerm
	'endlet'
;

// Rule ComprehensionTerm
ruleComprehensionTerm:
	(
		ruleSetCT
		    |
		ruleMapCT
		    |
		ruleSequenceCT
		    |
		ruleBagCT
	)
;

// Rule SetCT
ruleSetCT:
	'{'
	ruleVariableTerm
	'in'
	ruleTerm
	(
		','
		ruleVariableTerm
		'in'
		ruleTerm
	)*
	(
		'|'
		ruleTerm
	)?
	':'
	ruleTerm
	'}'
;

// Rule MapCT
ruleMapCT:
	'{'
	ruleVariableTerm
	'in'
	ruleTerm
	(
		','
		ruleVariableTerm
		'in'
		ruleTerm
	)*
	(
		'|'
		ruleTerm
	)?
	':'
	ruleTerm
	'}'
;

// Rule SequenceCT
ruleSequenceCT:
	'['
	ruleVariableTerm
	'in'
	ruleTerm
	(
		','
		ruleVariableTerm
		'in'
		ruleTerm
	)*
	(
		'|'
		ruleTerm
	)?
	':'
	ruleTerm
	']'
;

// Rule BagCT
ruleBagCT:
	'<'
	ruleVariableTerm
	'in'
	ruleTerm
	(
		','
		ruleVariableTerm
		'in'
		ruleTerm
	)*
	(
		'|'
		ruleTerm
	)?
	':'
	ruleTerm
	'>'
;

// Rule RuleAsTerm
ruleRuleAsTerm:
	'<<'
	ruleextendedName
	(
		'('
		rulegetDomainByID
		(
			','
			rulegetDomainByID
		)*
		')'
	)?
	'>>'
;

// Rule Rule
ruleRule:
	(
		ruleUpdateRule
		    |
		ruleTurboReturnRule
		    |
		ruleBasicRule
		    |
		ruleTermAsRule
		    |
		ruleTurboRule
		    |
		ruleDerivedRule
	)
;

// Rule TermAsRule
ruleTermAsRule:
	(
		ruleFunctionTerm
		    |ruleVariableTerm
	)
	(
		'['
		ruleTerm
		(
			','
			ruleTerm
		)*
		']'
	)?
;

// Rule BasicRule
ruleBasicRule:
	(
		ruleSkipRule
		    |
		ruleMacroCallRule
		    |
		ruleBlockRule
		    |
		ruleConditionalRule
		    |
		ruleChooseRule
		    |
		ruleForallRule
		    |
		ruleLetRule
		    |
		ruleExtendRule
	)
;

// Rule SkipRule
ruleSkipRule:
	'skip'
;

// Rule UpdateRule
ruleUpdateRule:
	(
		ruleLocationTerm
		    |ruleVariableTerm
	)
	':='
	ruleTerm
;

// Rule BlockRule
ruleBlockRule:
	'par'
	ruleRule
	ruleRule
	+
	'endpar'
;

// Rule ConditionalRule
ruleConditionalRule:
	'if'
	ruleTerm
	'then'
	ruleRule
	(
		'else'
		ruleRule
	)?
	'endif'
;

// Rule ChooseRule
ruleChooseRule:
	'choose'
	ruleVariableTerm
	'in'
	ruleTerm
	(
		','
		ruleVariableTerm
		'in'
		ruleTerm
	)*
	'with'
	ruleTerm
	'do'
	ruleRule
	(
		'ifnone'
		ruleRule
	)?
;

// Rule ForallRule
ruleForallRule:
	'forall'
	ruleVariableTerm
	'in'
	ruleTerm
	(
		','
		ruleVariableTerm
		'in'
		ruleTerm
	)*
	(
		'with'
		ruleTerm
	)?
	'do'
	ruleRule
;

// Rule LetRule
ruleLetRule:
	'let'
	'('
	ruleVariableTerm
	'='
	ruleTerm
	(
		','
		ruleVariableTerm
		'='
		ruleTerm
	)*
	')'
	'in'
	ruleRule
	'endlet'
;

// Rule MacroCallRule
ruleMacroCallRule:
	ruleextendedName
	'['
	(
		ruleTerm
		(
			','
			ruleTerm
		)*
	)?
	']'
;

// Rule ExtendRule
ruleExtendRule:
	'extend'
	rulegetDomainByID
	'with'
	ruleVariableTerm
	(
		','
		ruleVariableTerm
	)*
	'do'
	ruleRule
;

// Rule TurboRule
ruleTurboRule:
	(
		ruleSeqRule
		    |
		ruleIterateRule
		    |
		ruleTurboCallRule
		    |
		ruleTurboLocalStateRule
	)
;

// Rule SeqRule
ruleSeqRule:
	'seq'
	ruleRule
	ruleRule
	+
	'endseq'
;

// Rule IterateRule
ruleIterateRule:
	'iterate'
	ruleRule
	'enditerate'
;

// Rule TurboCallRule
ruleTurboCallRule:
	RULE_RULE_ID
	'('
	(
		ruleTerm
		(
			','
			ruleTerm
		)*
	)?
	')'
;

// Rule TurboReturnRule
ruleTurboReturnRule:
	(
		ruleFunctionTerm
		    |ruleVariableTerm
	)
	'<-'
	ruleTurboCallRule
;

// Rule TurboLocalStateRule
ruleTurboLocalStateRule:
	ruleLocalFunction
	'['
	ruleRule
	']'
	(
		ruleLocalFunction
		'['
		ruleRule
		']'
	)*
	ruleRule
;

// Rule DerivedRule
ruleDerivedRule:
	(
		ruleBasicDerivedRule
		    |
		ruleTurboDerivedRule
	)
;

// Rule BasicDerivedRule
ruleBasicDerivedRule:
	ruleCaseRule
;

// Rule CaseRule
ruleCaseRule:
	'switch'
	ruleTerm
	(
		'case'
		ruleTerm
		':'
		ruleRule
	)+
	(
		'otherwise'
		ruleRule
	)?
	'endswitch'
;

// Rule TurboDerivedRule
ruleTurboDerivedRule:
	(
		ruleRecursiveWhileRule
		    |
		ruleIterativeWhileRule
	)
;

// Rule RecursiveWhileRule
ruleRecursiveWhileRule:
	'whilerec'
	ruleTerm
	'do'
	ruleRule
;

// Rule IterativeWhileRule
ruleIterativeWhileRule:
	'while'
	ruleTerm
	'do'
	ruleRule
;

// Rule nameofDomain
rulenameofDomain:
	RULE_ID
;

// Rule MOD_ID
ruleMOD_ID:
	(
		(
			RULE_ENUM_ID
			    |
			RULE_ID
		)
		    |
		'../'*
		    |
		'./'*
	)?
	(
		(
			RULE_ENUM_ID
			    |
			RULE_ID
		)
		'/'
	)*
	(
		RULE_ENUM_ID
		    |
		RULE_ID
	)
	(
		'.'
		(
			RULE_ENUM_ID
			    |
			RULE_ID
			    |
			'asm'
		)
	)?
;

// Rule ID_VARIABLE
ruleID_VARIABLE:
	'$'
	(
		RULE_ID
		    |
		'rule'
		    |
		'agent'
		    |
		'seq'
	)
;

fragment RULE_DIGIT : '0'..'9';

RULE_NUMBER_TOKEN : RULE_DIGIT+;

RULE_NATNUMBER : RULE_NUMBER_TOKEN 'n';

RULE_REAL_NUMBER : RULE_NUMBER_TOKEN '.' RULE_NUMBER_TOKEN;

fragment RULE_MAIUSC_ID : 'A'..'Z';

fragment RULE_MIN_ID : 'a'..'z';

fragment RULE_ACCENT_CHR : ('\u00E0'|'\u00E8'|'\u00E9'|'\u00F2'|'\u00EC'|'\u00F9'|'\u00C3');

RULE_ENUM_ID : '^'? RULE_MAIUSC_ID RULE_MAIUSC_ID (RULE_MAIUSC_ID|RULE_DIGIT|'_')*;

fragment RULE_SPECIAL_CHAR : ('!'|'.'|','|':'|'-'|'+'|'$'|'%'|'('|')'|'['|']'|'='|'?'|'^'|'_'|';'|'\u00A8'|'@'|'>'|'<'|'|'|'\\'|'/');

RULE_RULE_ID : 'r_' (RULE_MAIUSC_ID|RULE_MIN_ID|RULE_DIGIT|'_')*;

RULE_ID : '^'? (RULE_MAIUSC_ID|RULE_MIN_ID|'_') (RULE_MAIUSC_ID|RULE_MIN_ID|RULE_DIGIT|'_')*;

RULE_CHAR_LITERAL : '\'' (RULE_MAIUSC_ID|RULE_MIN_ID|RULE_DIGIT|RULE_SPECIAL_CHAR|RULE_ACCENT_CHR)? '\'';

RULE_STRING_LITERAL : '"' (RULE_MAIUSC_ID|RULE_MIN_ID|RULE_DIGIT|RULE_WS|'\''|RULE_SPECIAL_CHAR|RULE_ACCENT_CHR)* '"';

RULE_STRING : '"' ~('"')* '"';

RULE_COMPLEX_NUMBER : RULE_IMMAGINARY_NUMBER;

fragment RULE_IMMAGINARY_NUMBER : 'i' RULE_DIGIT+ ('.' RULE_DIGIT+)?;

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/' {skip();};

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'* '\n')? {skip();};

RULE_WS : (' '|'\t'|'\r'|'\n')+ {skip();};

RULE_INT : ('0'..'9')+;

RULE_ANY_OTHER : .;
