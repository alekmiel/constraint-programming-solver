package com.po.constraintprogrammingsolver.problems.jobshop.factories;

import com.po.constraintprogrammingsolver.problems.jobshop.factories.comparatorvariable.ComparatorVariableType;
import com.po.constraintprogrammingsolver.problems.jobshop.factories.costfunction.CostFunctionType;
import com.po.constraintprogrammingsolver.problems.jobshop.factories.indomain.IndomainType;
import com.po.constraintprogrammingsolver.problems.jobshop.factories.selectchoicepoint.SelectChoicePointComparatorVariableType;
import com.po.constraintprogrammingsolver.problems.jobshop.factories.selectchoicepoint.SelectChoicePointStoreType;

/**
 * Created by Aleksander on 2015-01-04.
 */
public class JacopProviders {
    private JacopProviders() {
    }

    public static JacopProvider simpleJacopProvider(IndomainType indomainType, SelectChoicePointStoreType selectChoicePointType) {
        return new SimpleJacopProvider(indomainType, selectChoicePointType);
    }

    public static JacopProvider simpleJacopProviderWithCostFunction(IndomainType indomainType, SelectChoicePointStoreType selectChoicePointType, CostFunctionType costFunctionType) {
        return new SimpleJacopProvider(indomainType, selectChoicePointType, costFunctionType);
    }

    public static JacopProvider comparatorVariableJacopProvider(IndomainType indomainType, ComparatorVariableType comparatorVariableType, SelectChoicePointComparatorVariableType selectChoicePointType) {
        return new ComparatorVariableJacopProvider(indomainType, comparatorVariableType, selectChoicePointType);
    }

    public static JacopProvider comparatorVariableJacopProviderWithCostFunction(IndomainType indomainType, ComparatorVariableType comparatorVariableType, SelectChoicePointComparatorVariableType selectChoicePointType, CostFunctionType costFunctionType) {
        return new ComparatorVariableJacopProvider(indomainType, comparatorVariableType, selectChoicePointType, costFunctionType);
    }
}